package Seleniumprog;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExelProg {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chromeDriver","chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		WebElement nameAdd=driver.findElement(By.xpath("//input[@name='fullname']"));
		WebElement emailId=driver.findElement(By.id("emailid"));
		WebElement RpasswordEnter=driver.findElement(By.xpath("//input[@id='repass']"));
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement femaleRadioBt=driver.findElement(By.xpath("//input[@value='f']"));
		WebElement dayDropDown=driver.findElement(By.xpath("//select[@id='date_day']"));
		WebElement monthDropDown=driver.findElement(By.xpath("//select[@id='date_mon']"));
		WebElement yearDropDown=driver.findElement(By.xpath("//select[@name='Date_Year']"));
		WebElement locationTextBox=driver.findElement(By.xpath("//input[@id='signup_city']"));
		WebElement SchoolTextBox=driver.findElement(By.xpath("//input[@id='school']"));
		WebElement CollegeTextBox=driver.findElement(By.xpath("//input[@id='college']"));
		WebElement CaptchaTextBox=driver.findElement(By.xpath("//input[@id='fld_captcha']"));
		
		
		
		
		
//		nameAdd.sendKeys("khushbu");
//	emailId.sendKeys("khushbu@gmail.com");
//		password.sendKeys("khushi@111");
		FileInputStream file =new FileInputStream("C:\\Users\\MEGHAVI COMPUTERS\\eclipse-workspace\\JavaProgrmme2\\ExelFile\\Book2.xlsx") ;
		Sheet exel=WorkbookFactory.create(file).getSheet("sheet1");
		String v1=exel.getRow(0).getCell(0).getStringCellValue();
		
//		nameAdd.sendKeys(exel.getRow(0).getCell(0).getStringCellValue());
//		Thread.sleep(5000);
		nameAdd.sendKeys(exel.getRow(0).getCell(0).getStringCellValue());
		emailId.sendKeys(exel.getRow(0).getCell(1).getStringCellValue());
		password.sendKeys(exel.getRow(0).getCell(2).getStringCellValue());
		RpasswordEnter.sendKeys(exel.getRow(0).getCell(3).getStringCellValue());
		femaleRadioBt.click();
		Select s1=new Select(dayDropDown);
		s1.selectByVisibleText(exel.getRow(0).getCell(4).getStringCellValue());
		Select s2=new Select(monthDropDown);
		s2.selectByVisibleText(exel.getRow(0).getCell(5).getStringCellValue());
		Select s3=new Select(yearDropDown);
		s3.selectByVisibleText(exel.getRow(0).getCell(6).getStringCellValue());
		
		locationTextBox.sendKeys(exel.getRow(0).getCell(7).getStringCellValue());
		SchoolTextBox.sendKeys(exel.getRow(0).getCell(8).getStringCellValue());
		CollegeTextBox.sendKeys(exel.getRow(0).getCell(9).getStringCellValue());
		//CaptchaTextBox.sendKeys(exel.getRow(0).getCell(10).getStringCellValue());
		
	//	RpasswordEnter.sendKeys(exel.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(5000);
		
		driver.close();
	}

}
