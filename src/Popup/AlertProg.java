package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertProg {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\MEGHAVI COMPUTERS\\\\eclipse-workspace\\\\JavaProgrmme2\\\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		Alert a=driver.switchTo().alert();
		a.accept();
		Thread.sleep(5000);
		driver.close();
		

	}

}
