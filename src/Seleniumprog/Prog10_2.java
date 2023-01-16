package Seleniumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog10_2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chromeDriver","chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement dropDownOfCars=driver.findElement(By.xpath("//select[@id='cars']"));
		Select s=new Select(dropDownOfCars);
		System.out.println(s.isMultiple());
		s.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		s.selectByVisibleText("Audi");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
