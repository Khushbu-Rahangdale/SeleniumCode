package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog_3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\MEGHAVI COMPUTERS\\\\eclipse-workspace\\\\JavaProgrmme2\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		WebElement DayButton =driver.findElement(By.xpath("//select[@name='date_day']"));
		WebElement MonthButton =driver.findElement(By.xpath("//select[@name='date_mon']"));
		WebElement yearButton=driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Actions a=new Actions(driver);
		a.moveToElement(DayButton).build().perform();
//		a.sendKeys(Keys.ARROW_DOWN).build().perform();
//		Thread.sleep(2000);
//		a.sendKeys(Keys.ARROW_DOWN).build().perform();
//		Thread.sleep(2000);
//		a.sendKeys(Keys.ARROW_DOWN).build().perform();
//		Thread.sleep(2000);
//		a.sendKeys(Keys.ARROW_DOWN).build().perform();
//		Thread.sleep(2000);
//		a.sendKeys(Keys.ARROW_DOWN).build().perform();
//		Thread.sleep(2000);
		for(int i=1;i<=7;i++)
		{
			Thread.sleep(2000);
			
			a.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		for(int i=1;i<=7;i++)
		{
			Thread.sleep(2000);
			
			a.sendKeys(Keys.ARROW_UP).build().perform();
		}
		
		
		
		
		a.sendKeys(Keys.ENTER).build().perform();
		
	}

}
