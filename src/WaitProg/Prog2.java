package WaitProg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://chercher.tech/practice/explicit-wait");
		WebElement button1=driver.findElement(By.id("alert"));
		button1.click();
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		WebElement button2=driver.findElement(By.id("populate-text"));
		button2.click();
		WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.textToBePresentInElement(button2, "Selenium Webdriver"));
		
		WebElement button3=driver.findElement(By.id("display-other-button"));
		
		button3.click();
		WebDriverWait w3=new WebDriverWait(driver, Duration.ofSeconds(10));
	//	w3.until(ExpectedConditions.elementSelectionStateToBe(button3, true));
		
		
		
		driver.close();
	}

}
