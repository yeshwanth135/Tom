package Ps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Salary {
 public static void main(String[] args) throws Throwable {
	 FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
	 Workbook wb=WorkbookFactory.create(fis);
	 int read = wb.getSheet("Sheet2").getLastRowNum();
	 for(int i=1;i<=read;i++) {
	 double sal = wb.getSheet("Sheet2").getRow(i).getCell(2).getNumericCellValue();
	
	 if(sal>25000) {
		 System.out.println(wb.getSheet("Sheet2").getRow(i).getCell(1).getStringCellValue()+" "+sal);
	 }
		 
	 }
 }
}
