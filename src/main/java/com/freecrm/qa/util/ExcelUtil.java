package com.freecrm.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
	static Workbook book;
	static Sheet sheet;
	public static String excel_Path_Sheet = "C:\\Users\\Sandeep\\Eclipse WorkSpace\\OOPsFramework\\src\\main\\resources\\Executable\\excelData.xlsx";
	public static Object[][] getExcelData(String sheetName) {
		try {
			FileInputStream fis = new FileInputStream(excel_Path_Sheet);
			try {
			book = WorkbookFactory.create(fis);
			sheet = book.getSheet(sheetName);
			
			
			Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			
			for(int r = 0;r<sheet.getLastRowNum();r++){
				
				for(int c = 0;c<sheet.getRow(0).getLastCellNum();c++) {
					data[r][c] = sheet.getRow(r+1).getCell(c).toString();
				}
			}
			return data;
			} catch (InvalidFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		return null;
		
	}

}
