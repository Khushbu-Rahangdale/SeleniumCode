package Seleniumprog;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Prog10_3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chromeDriver","chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(Source);
		File dest=new File("C:\\Users\\MEGHAVI COMPUTERS\\eclipse-workspace\\JavaProgrmme2\\screenShot/photo.jpeg");
FileHandler.copy(Source, dest);
driver.close();

	}

}
