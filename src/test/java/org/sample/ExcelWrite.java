package org.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abarna\\eclipse-workspace\\Excel\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement btnCountry = driver.findElement(By.id("countries"));
		Select se = new Select(btnCountry);
		List<WebElement> allopt = se.getOptions();
		File f = new File("C:\\Users\\Abarna\\eclipse-workspace\\Excel\\excel folder\\write.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Sheet1");
		for (int i = 0; i < allopt.size(); i++) {
			WebElement a = allopt.get(i);
			String text = a.getText();
			System.out.println(text);	

	
		Row r = s.createRow(i);
		Cell c = r.createCell(0);
		c.setCellValue(text);
	}
		FileOutputStream Fi = new FileOutputStream(f);
		
		w.write(Fi);

	}
}
