package Seleniumprog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog6 {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chromeDriver", "ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php");
		WebElement day =driver.findElement(By.xpath("//select[@name='birthday_day']"));
		 Select s1 =new Select(day);
		 s1.selectByIndex(3);
		 Thread.sleep(2000);
		 s1.selectByVisibleText("1");
	     
		 WebElement month =driver.findElement(By.xpath("//select[@name='birthday_month']"));
		 Select s2= new Select(month);
		 s2.selectByIndex(3);
		 s2.selectByVisibleText("Aug");
		 s2.selectByVisibleText("Jan");
		
		 WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
		 Select s3=new Select(year);
		 s3.selectByVisibleText("1997");
		 Thread.sleep(2000);
		 
		 s3.selectByVisibleText("2000");
		 Thread.sleep(2000);
		 
		 s3.selectByVisibleText("2020");
		 Thread.sleep(2000);
		 s3.selectByVisibleText("2010");
		 WebElement element =s2.getFirstSelectedOption();
		 System.out.println(element.getText());
		 
		 
		 
		 
		// List<WebElement>AllDays=s1.getOptions();
//		 for(int i=1;i<32;i++)
//			 System.out.println(AllDays.get(i).getText());
//		 System.out.println("------------------");
	// List<WebElement>options=s1.getOptions();
//	 for(WebElement option:options)
//	 {
//		 System.out.println(option.getText());
		 
//	 }
		 
		
	}

}
