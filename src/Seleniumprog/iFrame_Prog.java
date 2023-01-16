package Seleniumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_Prog {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chromeDriver","chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
//		driver.switchTo().frame("iframeResult");

//		WebElement timeDisplayButton = driver.findElement(By.xpath("//button[@type='button']"));
//		timeDisplayButton.click();
//		Thread.sleep(5000);
//	driver.switchTo().parentFrame();
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		driver.switchTo().frame("iframeResult");
		WebElement timeDisplayButton = driver.findElement(By.xpath("//button[@type='button']"));
		timeDisplayButton.click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		

		driver.quit();

		

	}

}
