package Seleniumprog;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	
		public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\MEGHAVI COMPUTERS\\eclipse-workspace\\JavaProgrmme2\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.manage().window().minimize();
			Thread.sleep(2000);
			driver.get("https://mpsconline.gov.in/candidate/login");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.navigate().to("https://cetcell.mahacet.org/");
			Thread.sleep(3000);
			driver.navigate().to("https://www.google.com/search?q=freecharge&oq=&sourceid=chrome&ie=UTF-8");
			Thread.sleep(3000);
			Dimension d=new Dimension(200,300);
			driver.manage().window().setSize(d);
			Thread.sleep(3000);
			Point p=new Point(20,300);
			driver.manage().window().setPosition(p);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().forward();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			
			driver.close();
			
	
			
			
	}

}
