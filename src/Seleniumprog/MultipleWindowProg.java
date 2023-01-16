package Seleniumprog;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowProg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chromeDriver","chromeDriver.exe");
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--headless");
//		
//		
//		WebDriver driver=new ChromeDriver(options);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
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
		//driver.manage().window().maximize();
		
		driver.switchTo().window(win[1]);
		driver.manage().window().maximize();
		WebElement wind = driver.findElement(By.xpath("//h1[text()='About me']"));
		System.out.println(wind.getText());
		WebElement wind1 = driver.findElement(By.xpath("//span[text()='Home']"));
		wind1.click();
		Thread.sleep(3000);
		WebElement wind2 = driver.findElement(By.xpath("(//span[text()='Selenium'])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(wind2).build().perform();
		Thread.sleep(3000);
		a.contextClick().build().perform();
		Thread.sleep(3000);
		
		
		//span[text()='Home']
		
		System.out.println("Title of windows one ="+driver.getTitle());
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(win[0]);
		System.out.println("Title of windows Two ="+driver.getTitle());
		
		
		driver.close();
		
	}
	
}
