package Seleniumprog;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class ssProg2 {
	static WebDriver driver;
	public static void  FullSS() throws Exception
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\MEGHAVI COMPUTERS\\eclipse-workspace\\JavaProgrmme2\\screenShot/photo5.jpeg");
		FileHandler.copy(source, dest);
	}
	public static void Logo() throws Exception
	{
		WebElement Indialogo=driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in icp-nav-flag-discoverability-t1']"));
		WebElement amazonlogo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		
		File source = Indialogo.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\MEGHAVI COMPUTERS\\eclipse-workspace\\JavaProgrmme2\\screenShot/India2.jpeg");
		FileHandler.copy(source,dest);
		
	}
	public static void amazonLogo() throws Exception
	{
		WebElement amazonlogo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		File source = amazonlogo.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\MEGHAVI COMPUTERS\\eclipse-workspace\\JavaProgrmme2\\screenShot/amazon.jpeg");
		FileHandler.copy(source,dest);
	}
	public static void fullSreenShot() throws Exception
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		File source =((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\MEGHAVI COMPUTERS\\eclipse-workspace\\JavaProgrmme2\\screenShot/fullSc.jpeg");
		FileHandler.copy(source,dest);
		
	}

	
	

	public static void main(String[] args) throws Exception {
//		System.setProperty("WebDriver.chromeDriver","chromeDriver.exe");
//		 driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
//		FullSS();
//		Logo();
//		amazonLogo();
		//picLogo();
		fullSreenShot();
		
		driver.close();

	}

}
