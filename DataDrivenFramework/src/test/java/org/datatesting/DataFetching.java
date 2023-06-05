package org.datatesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFetching {
	
public static void main(String[] args) throws IOException {
	
	File excel = new File("C:\\Users\\AJITH KUMAR G\\eclipse-workspace\\DataDrivenFramework\\src\\test\\resources\\TEStng.xlsx");
	
	FileInputStream fin = new FileInputStream(excel);
	
	Workbook w = new XSSFWorkbook(fin);
	
	//To Get the number of rows used in excel
	Sheet s = w.getSheet("ajstyles");
	int physicalNumberOfRows = s.getPhysicalNumberOfRows();
	System.out.println(physicalNumberOfRows);
	
	//To Get the number of cells used in particular row from excel
	Row r = s.getRow(3);
	int physicalNumberOfCells = r.getPhysicalNumberOfCells();
	System.out.println(physicalNumberOfCells);
	
	//To get the particular cell value in row from excel
	Cell c = r.getCell(1);
	System.out.println(c);
	
	//To iterate each and every values in excel
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r1 = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c1= r1.getCell(j);
				System.out.println(c1);
			}
		}
		
}
}
