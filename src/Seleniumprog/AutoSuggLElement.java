package Seleniumprog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggLElement {

	public static void main(String[] args) throws Exception {
		System.setProperty("webDriver.ChromeDriver", "ChromeDriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("seleni");
		Thread.sleep(3000);
		 List<WebElement> autosuggElement = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		 for(int i=0;i<autosuggElement.size();i++)
		 {
			 System.out.println(autosuggElement.get(i).getText());
		 }
		 for(int i=0;i<autosuggElement.size();)
		 {
			 if(autosuggElement.get(i).getText().equals("selenium webdriver"));
			 {
				 autosuggElement.get(i).click();
				 break;
			 }
		 }

	driver.close();
	}

}
