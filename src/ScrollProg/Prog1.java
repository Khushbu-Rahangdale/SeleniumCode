package ScrollProg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webDriver.ChromeDriver", "ChromeDriver");
		ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		driver.get("https://smartcare.sbilife.co.in/SmartCare/login/login.html");
		Thread.sleep(3000);
	((JavascriptExecutor)driver).executeScript("scroll(10, 4000)");
	Thread.sleep(3000);
	}

}
