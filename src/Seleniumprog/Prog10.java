package Seleniumprog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog10 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chromeDriver","chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php");
		WebElement birthday=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s1=new Select (birthday);
		s1.selectByVisibleText("2");
		s1.selectByVisibleText("3");
		
	s1.selectByVisibleText("4");
	 WebElement element =s1.getFirstSelectedOption();
	 System.out.println(element.getText());
	 
		
//		List<WebElement>options=s1.getOptions();
//		for(WebElement v:options)
//		{
//		System.out.println(v.getText());
//		}


}
}	
