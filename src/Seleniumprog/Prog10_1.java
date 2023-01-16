package Seleniumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog10_1 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chromeDriver","chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		WebElement rediffLink=driver.findElement(By.xpath("//a[@class='ft11']"));
		int count =0;
		if((rediffLink.isDisplayed())==true)
		{
			System.out.println("Element is available");
			count++;
		}
		else
		{
			System.out.println("Element is not available");
		}
		WebElement rediffLogo=driver.findElement(By.xpath("//img[@class='halflogo']"));
		
		if((rediffLogo.isDisplayed())==true)
		{
			System.out.println("Element is available");
			count++;
		}
		else
		{
			System.out.println("Element is not available");
		}
		WebElement NewUser=driver.findElement(By.xpath("//b[text()='New User? Register here']"));
		
		if((NewUser.isDisplayed())==true)
		{
			System.out.println("Element is available");
			count++;
		}
		else
		{
			System.out.println("Element is not available");
		}
WebElement label=driver.findElement(By.xpath("//p[@class='grey1']"));
		
		if((label.isDisplayed())==true)
		{
			System.out.println("Element is available");
			count++;
		}
		else
		{
			System.out.println("Element is not available");
		}
WebElement firstName=driver.findElement(By.xpath("//div[text()='Your Full name']"));
		
		if((firstName.isDisplayed())==true)
		{
			System.out.println("Element is available");
			count++;
		}
		else
		{
			System.out.println("Element is not available");
		}
WebElement nameAdd=driver.findElement(By.xpath("//input[@name='fullname']"));
		
		if((nameAdd.isDisplayed())==true)
		{
			System.out.println("Element is available");
			count++;
		}
		else
		{
			System.out.println("Element is not available");
		}
WebElement email=driver.findElement(By.xpath("//div[text()='Your current email ID']"));
		
		if((email.isDisplayed())==true)
		{
			System.out.println("Element is available");
			count++;
		}
		else
		{
			System.out.println("Element is not available");
		}
WebElement emailId=driver.findElement(By.xpath("//input[@id='emailid']"));
		
		if((emailId.isDisplayed())==true)
		{
			System.out.println("Element is available");
			count++;
		}
		else
		{
			System.out.println("Element is not available");
		}
WebElement password=driver.findElement(By.xpath("//div[text()='New password']"));
		
		if((password.isDisplayed())==true)
		{
			System.out.println("Element is available");
			count++;
		}
		else
		{
			System.out.println("Element is not available");
		}
WebElement passwordEnter=driver.findElement(By.xpath("//input[@id='pass']"));
		
		if((passwordEnter.isDisplayed())==true)
		{
			System.out.println("Element is available");
			count++;
		}
		else
		{
			System.out.println("Element is not available");
		}
WebElement retypePassword=driver.findElement(By.xpath("//div[text()='Retype password']"));
		
		if((retypePassword.isDisplayed())==true)
		{
			System.out.println("Element is available");
			count++;
		}
		else
		{
			System.out.println("Element is not available");
		}
WebElement RpasswordEnter=driver.findElement(By.xpath("//input[@id='repass']"));
		
		if((RpasswordEnter.isDisplayed())==true)
		{
			System.out.println("Element is available");
			count++;
		}
		else
		{
			System.out.println("Element is not available");
		}
WebElement gender=driver.findElement(By.xpath("//div[text()='Gender:']"));
		
		if((gender.isDisplayed())==true)
		{
			System.out.println("Element is available");
			count++;
		}
		else
		{
			System.out.println("Element is not available");
		}
//		WebElement femaleTextBox=driver.findElement(By.xpath(""));
//		if((femaleTextBox.isDisplayed())==true)
//		{
//			System.out.println("Element is Available");
//			count++;
//		}
//		else
//		{
//			System.out.println("Element is not available");
//		}


		
		
		System.out.println("total No. of count= "+count);
		driver.close();

	}

}
