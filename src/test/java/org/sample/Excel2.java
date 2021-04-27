package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Abarna\\eclipse-workspace\\Excel\\excel folder\\datas.xlsx");
		FileInputStream s = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(s);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		int a = row.getPhysicalNumberOfCells();
		System.out.println(a);
		int b = sheet.getPhysicalNumberOfRows();
		System.out.println(b);
		
		
		
		
	}

}
