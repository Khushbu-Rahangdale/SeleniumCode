package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cursorOverPrg2 {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","chromedriver");
//		WebDriver driver	=new	ChromeDriver();
//		driver.manage().window().maximize();
		//driver.get("https://www.flipkart.com/");
		//Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
//		Thread.sleep(1000);
//		WebElement	loginBtn=driver.findElement(By.xpath("//a[text()='Login']"));
//		Actions	a=new Actions(driver);
//		a.moveToElement(loginBtn).build().perform();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[text()='Gift	Cards']")).click();
		//Thread.sleep(5000);
		//driver.close();
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\MEGHAVI COMPUTERS\\\\eclipse-workspace\\\\JavaProgrmme2\\\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement	loginBtn=driver.findElement(By.xpath("//a[text()='Login']"));
		Actions	a=new Actions(driver);
		a.moveToElement(loginBtn).build().perform();
		driver.findElement(By.xpath("//div[text()='Gift	Cards']")).click();
		Thread.sleep(5000);
		
	}

}
