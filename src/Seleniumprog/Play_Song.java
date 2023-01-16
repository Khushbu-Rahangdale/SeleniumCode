package Seleniumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Play_Song {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chromeDriver","ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement PlaySong =driver.findElement(By.xpath("//input[@id='search']"));
		PlaySong.sendKeys("arijit singh song");
	    Thread.sleep(2000);
		WebElement search= driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		search.click();
		Thread.sleep(2000);
	
     
		driver.findElement(By.xpath("(//h3[@id='video-title'])[1]")).click();;
		driver.findElement(By.xpath("(//div[@id='ad-text:3'][1])")).click();
        
		
		
		
		
		

	}

}
