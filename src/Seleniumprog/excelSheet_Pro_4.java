package Seleniumprog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelSheet_Pro_4 {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chromeDriver","ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		FileInputStream file =new FileInputStream("C:\\Users\\MEGHAVI COMPUTERS\\eclipse-workspace\\JavaProgrmme2\\ExelFile\\Book2.xlsx");
		Sheet excel=WorkbookFactory.create(file).getSheet("sheet2");
		for(int row=0;row<excel.getLastRowNum();row++)
		{
			for(int col=0;col<excel.getRow(row).getLastCellNum();col++)
			{
				String value=excel.getRow(row).getCell(col).getStringCellValue();
				System.out.print(value+"\t");
				
			}
			System.out.println();
			//driver.close();
		}
		driver.close();
		
	}

}
