package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Prog_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\MEGHAVI COMPUTERS\\\\eclipse-workspace\\\\JavaProgrmme2\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		driver.findElement(By.xpath("//input[@id='user-number']")).sendKeys("9158899222");
		Thread.sleep(2000);
		WebElement UserEmailID=driver.findElement(By.xpath("//input[@id='email_id']"));
		UserEmailID.sendKeys("khush@gmail.com");
		Thread.sleep(2000);
		WebElement ContButton=driver.findElement(By.xpath("//button[@id='irtct-acc-detail']"));
		ContButton.click();
		WebElement occDropDown=driver.findElement(By.xpath("//button[normalize-space(text())='Select Occupation']"));
		Actions a=new Actions(driver);
		//driver.findElement(By.xpath("//button[normalize-space(text())='Select	
		a.moveToElement(occDropDown).click().build().perform();
		for(int i=0;i<=5;i++)
		{
			Thread.sleep(2000);
			a.sendKeys(Keys.DOWN).build().perform();
		}
		for(int i=0;i<=5;i++)
		{
			Thread.sleep(2000);
			a.sendKeys(Keys.UP).build().perform();
		}
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
