package com.monster.npd.submission.custom;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.eibus.util.logger.CordysLogger;
import com.monster.npd.submission.util.EnumColumnMapper;
import com.monster.npd.submission.util.Util;

public class ExcelWrite {
	private static CordysLogger logger = CordysLogger.getCordysLogger(ExcelWriting.class);

	@SuppressWarnings("deprecation")
	public static void writingExcel(Map<Integer, GenerateExcelORCSVFile> allProjectData,
			Map<Integer, ArrayList<GovernanceMileStone>> allMileStoneMap, Map<Integer, ArrayList<Tasks>> taskMap,
			XSSFSheet sheet, XSSFWorkbook workbook) {
			logger.error("Inside Excel Writing");
		try {
			// Writing Projects stored in allProjectData
			int rowNum = sheet.getLastRowNum()+1;
			for (int projectKey : allProjectData.keySet()) {

				Row row = sheet.createRow(rowNum++);
				int colNum = 0;
				GenerateExcelORCSVFile project = allProjectData.get(projectKey);
				for (EnumColumnMapper columns : EnumColumnMapper.values()) {
					Cell cell = row.createCell(colNum++);

					String value = project.getStringProperty(columns.toString());

					if (Util.isNumeric(value)) {
						long intVal = project.getLongProperty(columns.toString());
						cell.setCellValue(intVal);
					} else if (Util.isDouble(value.toString())) {
						int colIndex = cell.getColumnIndex();
						sheet.setColumnWidth(colIndex, 25 * 200);
						Double doubleValue = new Double(value.toString());
						String formatVal = String.format("%.4f", doubleValue);
						cell.setCellValue(new Double(formatVal));
					} else if (Util.isValidDate(value.toString())) {

						int colIndex = cell.getColumnIndex();
						SimpleDateFormat datetemp = new SimpleDateFormat("dd/MM/yyyy");
						Date cellValue = datetemp.parse(value.toString());
						cell.setCellValue(cellValue);
						CellStyle dateCellStyle = workbook.createCellStyle();
						short df = workbook.createDataFormat().getFormat("dd/MM/yyyy");
						dateCellStyle.setDataFormat(df);
						cell.setCellStyle(dateCellStyle);
						sheet.setColumnWidth(colIndex, 25 * 128);
					} else {
						int colIndex = cell.getColumnIndex();
						sheet.setColumnWidth(colIndex, 25 * 180);
						cell.setCellValue(value);
					}
				}
			}
			logger.error("Project Writing done");
		} catch (Exception e) {
			logger.error("Excel Writing Failed " + e);

		}
	}
}
