package com.acheron.npd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GenerateExcel {

	public static void main(String[] args) {
		System.out.println("hi");
		try
	  	   {
	  	       FileInputStream myxls = new FileInputStream("C:\\Users\\AvinashRavat\\Documents\\Data\\test1.xlsx");
	  	       XSSFWorkbook  sheet = new XSSFWorkbook (myxls);
	  	       XSSFSheet  worksheet = sheet.getSheetAt(0);
	  	       int lastRow=worksheet.getLastRowNum();
	  	       System.out.println(lastRow);
	  	       Row row = worksheet.createRow(++lastRow);
	  	       row.createCell(1).setCellValue("Dr.Hola");
	  	       myxls.close();
	  	       FileOutputStream output_file =new FileOutputStream(new File("C:\\Users\\AvinashRavat\\Documents\\Data\\test1.xlsx"));  
	  	       //write changes
	  	       sheet.write(output_file);
	  	       output_file.close();
	  	       System.out.println(" is successfully written");
	  	    }catch(Exception e) {
	  	    	System.out.print(e);
	  	    }
			

	}

}
