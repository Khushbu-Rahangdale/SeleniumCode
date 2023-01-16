package ScrollProg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webDriver.ChromeDriver", "ChromeDriver");
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		driver.get("https://smartcare.sbilife.co.in/SmartCare/login/login.html");
		JavascriptExecutor je= (JavascriptExecutor) driver;
		//Identify the webElement which will appear after Scrolling down
		WebElement k=driver.findElement(By.xpath("//img[@src=\"../images/sbilife-logo.png\"]"));
		//it execute the Script till the element is not find 
		je.executeScript("arguments[0].scrollIntoView(true);",k );
		Thread.sleep(3000);
		System.out.println(k.getText());
		driver.close();
	}

}
