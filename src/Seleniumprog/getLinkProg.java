package Seleniumprog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLinkProg {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chromeDriver","chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.tagName("//*a"));
		 List<WebElement> link = driver.findElements(By.xpath("//a"));
		 System.out.println(link.size());
		 for(int i=0;i<link.size();i++)
			 
		 {
			System.out.println(link.get(i).getAttribute("href"));
			// System.out.println(link.get(i).getText());
		 }
//		 List<WebElement> link = driver.findElements(By.tagName("a"));
//		System.out.println(link.size());
//		 int khushbu=link.size();
//		 System.out.println(link.size());
//		 
//		 for(int i=1;i<khushbu;i++)
//			 
//		 {
//			 WebElement c=link.get(i);
//			 String d=c.getText();
//			 System.out.println(c);
//		 }
		 driver.close();
		 
	}

}
