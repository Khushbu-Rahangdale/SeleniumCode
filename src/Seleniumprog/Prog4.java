package Seleniumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog4 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chromeDriver", "chromeDriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/campaign/landing.php");
WebElement fullNameTextbox= driver.findElement(By.xpath("//input[@name='firstname']"));
fullNameTextbox.sendKeys("khushbu");
Thread.sleep(2000);
WebElement surnameTextbox = driver.findElement(By.xpath("//input[@name='lastname']"));
surnameTextbox.sendKeys("Rahangdale");
Thread.sleep(2000);
WebElement mobileNumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
mobileNumber.sendKeys("9158899822");
Thread.sleep(2000);
WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
password.sendKeys("khushbu@123");
Thread.sleep(2000);
//driver.findElement(By.name("birthday_day")).click();
Thread.sleep(2000);
WebElement Dob = driver.findElement(By.xpath("//option[text()='1']"));
Dob.click();
//driver.findElement(By.name("birthday_day")).click();
//driver.findElement(By.name("birthday_month")).click();
Thread.sleep(2000);
WebElement month = driver.findElement(By.xpath("//option[text()='Aug']"));
month.click();
//WebElement year= driver.findElement(By.xpath(""));

WebElement female =driver.findElement(By.xpath("//input[@value='1']"));
female.click();
Thread.sleep(2000);
driver.close();



	}
}
