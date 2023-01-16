package Seleniumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.ChromeDriver","ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smartcare.sbilife.co.in/SmartCare/login/login.html");
		Thread.sleep(3000);
		//driver.findElement(By.className("checkmark shadow")).click();
		WebElement number=driver.findElement(By.xpath("//input[@id=\"mobileNumberId\"]"));
		number.sendKeys("9158899822");
		WebElement pass=driver.findElement(By.xpath("//input[@id=\"pinId\"]"));
		pass.sendKeys("khushbu@111");

	}

}
