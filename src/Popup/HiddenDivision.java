package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\MEGHAVI COMPUTERS\\\\eclipse-workspace\\\\JavaProgrmme2\\\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.flipkart.com/");
////button[text()='✕']
		//driver.get("https://demo.automationtesting.in/Alerts.html");
	//	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//		driver.get("https://demoqa.com/alerts");
//		driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
//		Alert b=driver.switchTo().alert();
//		b.accept();
//		Thread.sleep(5000);
	driver.get("https://demoqa.com/alerts");
//		driver.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();
//		
//		Alert c=driver.switchTo().alert();
//		c.accept();
		
//	driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	driver.findElement(By.xpath("//button[@id='promtButton']")).click();
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//driver.close();
	}

}
