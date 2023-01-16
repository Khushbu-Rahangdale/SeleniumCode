package Seleniumprog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeOptionProg {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chromeDriver","chromeDriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		
		
		WebDriver driver=new ChromeDriver(options);
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.merge(capabilities);
		ChromeDriver driver1=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		String Title=driver.getTitle();
		System.out.println("page Title"+Title);
		driver.quit();

	}

}
