package WaitProg;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PagetimeOutProg {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(5,	TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(5,	TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		driver.close();
		
		//driver.manage().timeouts().pageLoadTimeot(Duration.seconds(10));
		
	}

}
