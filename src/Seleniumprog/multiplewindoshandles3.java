package Seleniumprog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindoshandles3 {
	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chromeDriver","chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.indeed.com/");
		driver.findElement(By.xpath("//div[@class='gnav-header-1ble2gn eu4oa1w0']")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator it=windows.iterator();
		System.out.println("All windows");
		System.out.println("no.of Element ="+windows.size());
		String win[]=new String[4];
		for(int i=0;i<windows.size();i++)
		{
			win[i]=(String) it.next();
			System.out.println(win[i]);
		}
		driver.switchTo().window(win[1]);
		System.out.println("Title of windows one ="+driver.getTitle());
		driver.close();
//		driver.findElement(By.id("login-google-button")).click();
//		
//		Iterator itr=windows.iterator();
//		System.out.println("All windows");
//		System.out.println("no.of Element ="+windows.size());
//		String win1[]=new String[4];
//		for(int i=0;i<windows.size();i++)
//		{
//			win1[i]=(String) itr.next();
//			System.out.println(win1[i]);
//		}
//		driver.switchTo().window(win[2]);
//		System.out.println("Title of windows three ="+driver.getTitle());
//		driver.close();
		
		
		driver.switchTo().window(win[0]);
		System.out.println("Title of windows Two ="+driver.getTitle());
		Thread.sleep(3000);
		
        driver.findElement(By.id("login-google-button")).click();
		Iterator itr=windows.iterator();
		System.out.println("All windows");
		System.out.println("no.of Element ="+windows.size());
		String win1[]=new String[4];
		for(int i=0;i<windows.size();i++)
		{
			win1[i]=(String) itr.next();
			System.out.println(win1[i]);
		}
		driver.switchTo().window(win[1]);
		System.out.println("Title of windows three ="+driver.getTitle());
		driver.close();
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
