package Seleniumprog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinkProg2 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chromeDriver","chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		List<WebElement> Links = driver.findElements(By.xpath("//a"));
		System.out.println(Links.size());
		for(int i=0;i<Links.size();i++)
		{
			System.out.println(Links.get(i).getText());
		}
		for(int i=0;i<Links.size();i++)
		{
			String expStr="Privacy";
			String actStr=Links.get(i).getText();
			if(expStr.equals(actStr))
			{
				Links.get(i);
				break;
			}
		}
		System.out.println("Current Title2 ="+driver.getTitle());
			
		driver.close();
		
	}

}
