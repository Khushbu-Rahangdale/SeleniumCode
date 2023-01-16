package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog_4 {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\MEGHAVI COMPUTERS\\\\eclipse-workspace\\\\JavaProgrmme2\\\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement value1=driver.findElement(By.xpath("//a[text()= \"-5000 \"] "));
		WebElement value2=driver.findElement(By.xpath("//a[text()= \" 5000 \"] "));
		WebElement value3=driver.findElement(By.xpath("//a[text()= \"-5000 \"] "));
		WebElement value4=driver.findElement(By.xpath("//a[text()= \" 5000\"] "));
		WebElement value5=driver.findElement(By.xpath("//a[text()= \" BANK \"] "));
	WebElement value6=driver.findElement(By.xpath(" //a[text()= \" SALES \"]"));
		WebElement value7=driver.findElement(By.xpath("//ol[@id='bank']"));
		WebElement value8=driver.findElement(By.xpath("//ol[@id='amt7']"));
		WebElement value9=driver.findElement(By.xpath("//ol[@id='loan']"));
		WebElement value10=driver.findElement(By.xpath("//ol[@id='amt8']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(value1, value7).build().perform();
		Thread.sleep(3000);
		
//		Actions a=new Actions(driver);
//		a.moveToElement(value1).build().perform();
		
		//li[@data-id="2"][1]
		//li[@id="credit0"]
		//(//li[@class="placeholder"])[1]
		
		
		
		
		
		
		
		
	}

}
