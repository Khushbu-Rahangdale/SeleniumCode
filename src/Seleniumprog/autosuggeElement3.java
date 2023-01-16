package Seleniumprog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggeElement3 {

	public static void main(String[] args) {
		System.setProperty("webDriver.ChromeDriver", "ChromeDriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://money.rediff.com/index.html");
//		List<WebElement> listBox = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
//		for(int i=0;i<listBox.size();i++)
//		{
//			System.out.println(listBox.get(i).getText());
//			
//		}
		
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
		driver.findElement(By.xpath("//a[@id='showMoreLess']")).click();
		List<WebElement> tableData = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr"));
		for(int i=0;i<tableData.size();i++)
		{
			System.out.println(tableData.get(i).getText());
			
		}
		driver.close();

	}

}
