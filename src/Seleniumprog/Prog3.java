package Seleniumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog3 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\MEGHAVI COMPUTERS\\\\eclipse-workspace\\\\JavaProgrmme2\\\\chromedriver.exe");
	WebDriver driver=new  ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://is.rediff.com/signup/register");
//	driver.findElement(By.tagName("input")).sendKeys("Khushbu Rahangdale");
//	Thread.sleep(2000);
//	driver.findElement(By.id("emailid")).sendKeys("khushbu@gmail.com");
//	Thread.sleep(2000);
//	driver.findElement(By.name("pass")).sendKeys("admin@123");
//	Thread.sleep(2000);
//	driver.findElement(By.name("repass")).sendKeys("admin@123");
//	Thread.sleep(2000);
//	
//	driver.findElement(By.xpath("//*[@id=\"form_simple\"]/div[14]/input[2]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@value=\"f\"]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.name("date_day")).sendKeys("01");
//	driver.findElement(By.name("date_mon")).sendKeys("aug");
//	driver.findElement(By.name("Date_Year")).sendKeys("1997");
//	Thread.sleep(2000);
//	driver.findElement(By.id("signup_city")).sendKeys("gondia");
//	Thread.sleep(2000);
//	driver.findElement(By.name("school")).sendKeys("DBScience");
//	Thread.sleep(2000);
//	driver.findElement(By.id("college")).sendKeys("DBScience");
//	Thread.sleep(2000);
//	driver.findElement(By.name("fld_captcha")).sendKeys("22345");
//	Thread.sleep(2000);
	
	String expTitle ="rediff";
	String actTitle=driver.getTitle();
	if(expTitle.equals(actTitle))
	{
		System.out.println("pass");
		
	}
	else
	{
		System.out.println("fail");
	}
	driver.close();
	
	
	
	
	}

}
