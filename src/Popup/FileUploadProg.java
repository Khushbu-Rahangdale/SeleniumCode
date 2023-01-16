package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadProg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\MEGHAVI COMPUTERS\\\\eclipse-workspace\\\\JavaProgrmme2\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		Thread.sleep(1000);
		WebElement chooseFile = driver.findElement(By.xpath("//input[@name='upfile']"));
		chooseFile.sendKeys("C:\\Users\\MEGHAVI COMPUTERS\\Desktop\\khush.txt");
		Thread.sleep(1000);
		WebElement pressButton = driver.findElement(By.xpath("//input[@value='Press']"));
		pressButton.click();
		driver.close();

	}

}
