package Practise;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Salary {


	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\sunny\\eclipse-workspace\\mavoo\\data\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int lastrow = wb.getSheet("Sheet2").getLastRowNum();
		for(int i=1;i<=lastrow;i++)
		{
			String salofemployee = wb.getSheet("Sheet2").getRow(i).getCell(2).getStringCellValue();
			if(Integer.parseInt(salofemployee)>49000)
			{
				System.out.println(wb.getSheet("Sheet2").getRow(i).getCell(1).getStringCellValue()+" "+salofemployee);
			}
		
		
		}
		
}

}
