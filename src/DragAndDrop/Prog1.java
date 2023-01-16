package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\MEGHAVI COMPUTERS\\\\eclipse-workspace\\\\JavaProgrmme2\\\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
driver.switchTo().frame(iframe);
WebElement Trash1=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
WebElement Trash2=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
WebElement Trash3=driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
WebElement Trash4=driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
WebElement trash5=driver.findElement(By.xpath("//div[@id='trash']"));
Actions a=new Actions(driver);
Thread.sleep(3000);
a.dragAndDrop(Trash1, trash5).build().perform();
Thread.sleep(3000);
a.dragAndDrop(Trash2, trash5).build().perform();
Thread.sleep(3000);
a.dragAndDrop(Trash3, trash5).build().perform();
Thread.sleep(3000);
a.dragAndDrop(Trash4, trash5).build().perform();
Thread.sleep(3000);
driver.close();


		

	}

}
