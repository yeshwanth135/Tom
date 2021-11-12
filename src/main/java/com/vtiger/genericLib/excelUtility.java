package com.vtiger.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class excelUtility {
	
	@Test
	public String excelutility(String sheetname,int row,int cell) throws Throwable {
		FileInputStream fis=new FileInputStream(ipathConstant.excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row r = sh.getRow(row);
		Cell c=r.getCell(cell);
		return c.getStringCellValue();
	}

}
