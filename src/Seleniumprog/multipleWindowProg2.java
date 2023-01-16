package Seleniumprog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.checkerframework.checker.lock.qual.EnsuresLockHeldIf.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.Browser.GetWindowForTargetResponse;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

public class multipleWindowProg2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chromeDriver","chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"https://www.facebook.com/OrangeHRM\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@aria-label=\"Accept Cookies\"]")).click();
//		Set<String> windows = driver.getWindowHandles();
//		
//		Iterator it=windows.iterator();
//		System.out.println("All windows");
//		System.out.println("no.of Element ="+windows.size());
//		String win[]=new String[4];
//		for(int i=0;i<windows.size();i++)
//		{
//			win[i]=(String) it.next();
//			System.out.println(win[i]);
//		}
//		driver.switchTo().window(win[0]);
//		System.out.println("Title of windows one ="+driver.getTitle());
//		driver.close();
//		Thread.sleep(2000);
//		driver.switchTo().window(win[1]);
//		System.out.println("Title of windows Two ="+driver.getTitle());
		
		
		//driver.close();
		
		
			

	
        }

	
			
	

	
		
	}
