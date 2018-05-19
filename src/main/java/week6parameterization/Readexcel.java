package week6parameterization;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel extends ProjectMethods {
	public Object[][] rexcel(String filename) throws IOException {
		//open the workbook
		XSSFWorkbook wbook=new XSSFWorkbook("./data/"+filename+".xlsx");
		//go to the sheet
		XSSFSheet sheet = wbook.getSheetAt(0);
		//identify the row
		int rowcount = sheet.getLastRowNum();
		//identify the column
		short colcount = sheet.getRow(0).getLastCellNum();
		//read the data
		Object[][] data=new Object[rowcount][colcount];
		for(int i=1;i<=rowcount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<colcount;j++) {
			
				XSSFCell cell = row.getCell(j);
				data[i-1][j]=cell.getStringCellValue();
			}
		}
		wbook.close();
		return data;
		
		
		
		
	}

}
