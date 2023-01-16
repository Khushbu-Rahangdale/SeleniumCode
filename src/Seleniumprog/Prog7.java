package Seleniumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog7 {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.ChromeDriver","ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Dipak");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Sisodiya");
		Thread.sleep(1000);
		WebElement emailIdTextbox = driver.findElement(By.xpath("//input[contains(@id,'u_0_g_')]"));
		emailIdTextbox.sendKeys("dipaksisodiya@gmail.com");
		Thread.sleep(1000);
		WebElement emailIdTextboxRe = driver.findElement(By.xpath("//input[contains(@id,'u_0_j_')]"));
		emailIdTextboxRe.sendKeys("dipaksisodiya@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password_step_input")).sendKeys("Dipak@567");
		Thread.sleep(1000);
		WebElement day= driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s1 = new Select(day);
		Thread.sleep(1000);
		s1.selectByIndex(5);
		Thread.sleep(1000);
		s1.selectByVisibleText("12");
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s = new Select(month);
		Thread.sleep(1000);
		s.selectByIndex(5);
		Thread.sleep(1000);
		s.selectByVisibleText("Aug");
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2 = new Select(year);
		Thread.sleep(1000);
		s2.selectByIndex(5);
		Thread.sleep(1000);
		s2.selectByVisibleText("2010");
		Thread.sleep(1000);

	}

}
