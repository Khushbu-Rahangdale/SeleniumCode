package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertProg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\MEGHAVI COMPUTERS\\\\eclipse-workspace\\\\JavaProgrmme2\\\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("good morning");
		Thread.sleep(5000);
		a.accept();
		Thread.sleep(5000);
		driver.close();
	//	a.getText();
		

		}

}
