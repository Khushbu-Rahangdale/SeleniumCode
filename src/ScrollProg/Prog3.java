package ScrollProg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog3 {

	
		public static void main(String[] args) {
			System.setProperty("webDriver.ChromeDriver", "ChromeDriver");
			ChromeDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
			
			//Thread.sleep(3000);
			driver.get("https://www.facebook.com/");
			//WebElement k=driver.findElement(By.id("email"));
			//k.sendKeys("khushbu");
			JavascriptExecutor je= (JavascriptExecutor) driver;
			WebElement k=driver.findElement(By.id("email"));
			je.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');",k );
			k.sendKeys("khushbu");
		}
}
