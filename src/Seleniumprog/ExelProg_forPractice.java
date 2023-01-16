package Seleniumprog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExelProg_forPractice {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chromeDriver","ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
////	FileInputStream  file= new FileInputStream("C:\\\\Users\\\\MEGHAVI COMPUTERS\\\\eclipse-workspace\\\\JavaProgrmme2\\\\ExelFile\\\\Book2.xlsx");
////	Sheet excel =WorkbookFactory.create(file).getSheet("sheet2");
////	//String v=excel.getRow(0).getCell(0).getStringCellValue();
////	for(int row=0;row<excel.getLastRowNum();row++)
////	{
////		for(int col=0;col<excel.getRow(row).getLastCellNum();col++)
////		{
////			String v=excel.getRow(row).getCell(col).getStringCellValue();
////			System.out.print(v+"\t");
////		}
////		System.out.println();
//	}
		FileInputStream file =new FileInputStream("C:\\\\\\\\Users\\\\\\\\MEGHAVI COMPUTERS\\\\\\\\eclipse-workspace\\\\\\\\JavaProgrmme2\\\\\\\\ExelFile\\\\\\\\Book2.xlsx");
		
		Sheet excel=WorkbookFactory.create(file).getSheet("sheet1");
		for(int row=0;row<excel.getLastRowNum();row++)
		{
		for(int col=0;col<excel.getRow(row).getLastCellNum();col++)
		{
		String a=excel.getRow(row).getCell(col).getStringCellValue();
		System.out.println(a+"\t");
		}
		}
	
	}

}
