package com.npd.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileWriting {

	@SuppressWarnings("deprecation")
	static boolean isValidDate(String strNum) {

		if (strNum == null) {
			return false;
		}
		try {
			long d = Date.parse(strNum);
		} catch (IllegalArgumentException nfe) {
			return false;
		}
		return true;
	}
	static boolean isDouble(String strNum) {

		if (strNum == null) {
			return false;
		}
		try {
			double d = Double.parseDouble(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException, ParseException {
		String excelFilePath = "C:\\Users\\AvinashRavat\\Documents\\Data\\test1.xlsx";
		File newFile=new File(excelFilePath);

		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("EmpInfo");
		
		ArrayList<Object[]> empdata = new ArrayList<Object[]>();

		empdata.add(new Object[] { "Empid", "Name", "Job", "Date", "salary" });
		empdata.add(new Object[] { 1524062112, "Avinash", "Enginner", "25/04/2022", 1200.07766654 });
		empdata.add(new Object[] { 102, "Ayan", "Manager", "26/04/2022", 1300.25 });
		empdata.add(new Object[] { 103, "Naveen", "Analyst", "27/04/1998", 2000.1 });

		/// using for...each loop

		int rownum = 0;
		 CellStyle dateCellStyle = workbook.createCellStyle();
		for (Object[] emp : empdata) {
			XSSFRow row = sheet.createRow(rownum++);
			int cellnum = 0;

			for (Object value : emp) {
				XSSFCell cell = row.createCell(cellnum++);
				 if (value instanceof Integer) {
					cell.setCellValue((Integer) value);
				}
				else if(isDouble(value.toString())) {
	    		    	Double d=new Double(value.toString());
	    		    	String formatVal=String.format("%.4f",d);
	    		    	cell.setCellValue(new Double(formatVal));
	    		    }
				else if (isValidDate(value.toString())) {
					SimpleDateFormat datetemp = new SimpleDateFormat("dd/MM/yyyy");
					Date cellValue = datetemp.parse(value.toString());
					cell.setCellValue(cellValue);
					for(int itr=1;itr<=50000;itr++) {
					 short df = workbook.createDataFormat().getFormat("dd/MM/yyyy");
					 dateCellStyle.setDataFormat(df);
					}
					
				}
				else if (value instanceof String) {
					cell.setCellValue((String) value);
				}
			
				else if (value instanceof Boolean) {
					cell.setCellValue((Boolean) value);
				}
				
			}
		}
		FileOutputStream outstream = new FileOutputStream(newFile);
		workbook.write(outstream);

		outstream.close();

		System.out.println("Employee.xls file written successfully...");

	}

}

//for(int r=0;r<=rows;r++) {
//XSSFRow row=sheet.getRow(r);
//for(int c=0;c<cols;c++) {
//	XSSFCell cell=row.getCell(c);
//	
//	switch(cell.getCellType()) {
//	case STRING: System.out.println(cell.getStringCellValue());break;
//	case NUMERIC: System.out.println(cell.getNumericCellValue());break;
//	case BOOLEAN: System.out.println(cell.getBooleanCellValue());break;
//	}
//}
//System.out.println();
//}

