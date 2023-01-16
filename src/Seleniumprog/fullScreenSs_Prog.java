package Seleniumprog;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fullScreenSs_Prog {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		File source =((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Dipak\\eclipse-workspace\\Slenium\\SC/photo6.jpeg");
		FileHandler.copy(source, dest);
		driver.quit();
	}

}
