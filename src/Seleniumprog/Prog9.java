package Seleniumprog;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog9 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chromeDriver","chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecharge.in/");
		Dimension d=new Dimension(200,300);
		driver.manage().window().setSize(d);
		Point p =new Point(20,200);
		driver.manage().window().setPosition(p);
		
		driver.quit();

	}

}
