package Seleniumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog8 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webDriver.ChromeDriver", "ChromeDriver");
		ChromeDriver driver=new ChromeDriver();
		
		Dimension d= new Dimension(200,300);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p=new Point(10,300);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		driver.get("https://smartcare.sbilife.co.in/SmartCare/login/login.html");
		Thread.sleep(3000);
	((JavascriptExecutor)driver).executeScript("scroll(10, 4000)");
	Thread.sleep(3000);
	WebElement k=driver.findElement(By.xpath("(//label[@class='radiolabel'])[2]"));
	k.click();
	Thread.sleep(3000);
	
	WebElement skip=driver.findElement(By.xpath("//a[text()='Skip']"));
	skip.click();
	Thread.sleep(3000);
	driver.close();
		
		
	}

		
}
