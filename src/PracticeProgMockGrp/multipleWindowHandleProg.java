package PracticeProgMockGrp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindowHandleProg {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chromeDriver","chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.indeed.com/");
	
		Set<String> windows=driver.getWindowHandles();
		Iterator itr=windows.iterator();
//		while(itr.hasNext())
//		{
//		System.out.println(itr.next());
//		System.out.println(windows.size());
//		}
		String a[]=new String [4];
		for(int i=0;i<windows.size();i++)
		{
		 a[i]= (String) itr.next();
		 System.out.println(a[i]);
		}
		driver.switchTo().window(a[1]);
		
		
	}
}
