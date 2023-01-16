package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonAddToCartProg {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chromeDriver","ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement SearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		SearchBox.sendKeys("iphone12");
		WebElement SearchBtn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		SearchBtn.click();
//		WebElement SelectPhone=driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Apple iPhone 12 (128GB) - Blue']"));
//		SelectPhone.click();
		driver.get("https://www.amazon.in/New-Apple-iPhone-12-128GB/dp/B08L5TNJHG/ref=sr_1_1_sspa?crid=2ZUT4MX0KP8UW&keywords=iphone%2B12&qid=1671176273&s=electronics&sprefix=ip%2Celectronics%2C644&sr=1-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
		//WebElement SelectPhone=driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Apple iPhone 12 (128GB) - Blue']"));
		//SelectPhone.click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		//driver.close();
	}

}
