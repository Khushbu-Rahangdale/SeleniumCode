package Seleniumprog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExelSheet_Prog2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chromeDriver","ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.flipkart.com/");
		FileInputStream file =new FileInputStream("C:\\Users\\MEGHAVI COMPUTERS\\eclipse-workspace\\JavaProgrmme2\\ExelFile\\Book2.xlsx");
Sheet excel=WorkbookFactory.create(file).getSheet("sheet2");
for(int row=0;row<5;row++)
{
	for(int column=0;column<4;column++)
	{
		String v=excel.getRow(row).getCell(column).getStringCellValue();
		System.out.print(v+"\t");
	}
	System.out.println();
}

	}

}
