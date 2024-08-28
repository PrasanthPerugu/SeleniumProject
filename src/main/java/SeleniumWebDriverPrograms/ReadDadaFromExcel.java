package SeleniumWebDriverPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDadaFromExcel {

	public static void main(String[] args) throws IOException  {

		FileInputStream file = new FileInputStream("C:\\Users\\prasa\\OneDrive\\Documents\\testData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("sheet2");
		
		int totalrows = sheet.getLastRowNum();
		
		int totalcell = sheet.getRow(1).getLastCellNum();
		
		System.out.println(totalrows);
		System.out.println(totalcell);
		

	for(int r=0; r<totalrows; r++) {
		XSSFRow currentrow = sheet.getRow(r);
		for(int c=0; c<totalcell; c++) {
			XSSFCell cell = currentrow.getCell(c);
			System.out.print(cell.toString()+"\t");
		}
		System.out.println();
	}
		workbook.close();
		file.close();
	}	
}
