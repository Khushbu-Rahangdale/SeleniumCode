package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\MEGHAVI COMPUTERS\\\\eclipse-workspace\\\\JavaProgrmme2\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//WebElement rightClickBtn=driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement doubleClickBtn=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	/*	Actions a=new Actions(driver);
		a.moveToElement(rightClickBtn).contextClick().build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);*/

	Actions b=new Actions(driver);
		b.doubleClick(doubleClickBtn).build().perform();
		//Thread.sleep(2000);
		//b.sendKeys(Keys.ENTER).build().perform();
	//	Alert a=driver.switchTo().alert();
		///((Alert) b).accept();
		//Thread.sleep(2000);
		//driver.close();
		
		
		
	}

}
