package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog_4 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\MEGHAVI COMPUTERS\\\\eclipse-workspace\\\\JavaProgrmme2\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		//img[@alt='The peaks of High Tatras']
		//img[@alt='The chalet at the Green mountain lake']
		//img[@alt='On top of Kozi kopka']
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		WebElement pic1=driver.findElement(By.xpath("img[@alt='The peaks of High Tatras']"));
		WebElement pic2=driver.findElement(By.xpath("img[@alt='The chalet at the Green mountain lake']"));
		WebElement pic3=driver.findElement(By.xpath("img[@alt='On top of Kozi kopka']"));
		WebElement pic4=driver.findElement(By.xpath("//ul[@class='gallery ui-helper-reset']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(pic1, pic4).build().perform();
		a.dragAndDrop(pic2, pic4).build().perform();
		

		
	}

}
