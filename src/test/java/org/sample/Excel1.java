package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {
public static void main(String[] args) throws IOException {
	File F = new File("C:\\Users\\Abarna\\eclipse-workspace\\Excel\\excel folder\\datas.xlsx");
	FileInputStream stream = new FileInputStream(F);
	Workbook w = new XSSFWorkbook(stream);
	 Sheet sheet = w.getSheet("Sheet1");
	 
	 for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		 Row row = sheet.getRow(i);
		 for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			 Cell cell = row.getCell(j);
			 System.out.println(cell);
			 
			
		}
		
	}
	
	
	
}
}
