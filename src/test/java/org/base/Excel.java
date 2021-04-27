package org.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel {
	WebDriver driver;

	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void launchUrl(String data) {
		driver.get(data);
	}
    public void excel(String data) throws IOException {
		File f = new File("C:\\\\Users\\\\Abarna\\\\eclipse-workspace\\\\Excel\\\\excel folder\\\\writecreation.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s =w.createSheet("data");
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue(data);
		FileOutputStream out = new FileOutputStream(f);
		w.write(out);
		
    }
	
    
	
	
	

}
