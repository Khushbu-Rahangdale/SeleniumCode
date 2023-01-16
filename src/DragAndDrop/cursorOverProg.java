package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cursorOverProg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\MEGHAVI COMPUTERS\\\\eclipse-workspace\\\\JavaProgrmme2\\\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement PrimeUrl=driver.findElement(By.xpath("//span[text()='Prime']"));
		Actions a=new Actions(driver);
		a.moveToElement(PrimeUrl).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@id='multiasins-img-link']")).click();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
