package com.automation.ui.base.common.hybrid;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelSuite {


	private static Logger logger = Logger
			.getLogger(ExecuteTestCases.class);

	public static void main(String[] args) {
		ReadExcelSuite read = new ReadExcelSuite();
		read.getNumberOfSheetsinSuite();
	}

	public List<String> getNumberOfSheetsinSuite() {
		List<String> listOfSheets = new ArrayList<String>();

		try {
			Workbook workbook = WorkbookFactory
					.create(new File(
							"resources"+ File.separator + "TestSuitePrototype.xlsx"));
			for (int i = 0; i < workbook.getNumberOfSheets(); i++) {

			}

		} catch (InvalidFormatException | IOException e) {

			logger.error(e.getMessage());
		}
		return listOfSheets;

	}

	public static String readCell(int rowNum, int ColNum) {
		Workbook workbook;
		String cellValue = null;
		try {
			workbook = WorkbookFactory.create(new File(
					"resources"+ File.separator + "TestCaseSheet.xlsx"));
			Sheet sheet = workbook.getSheetAt(0);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(ColNum);
			cellValue = cell.getStringCellValue();
		} catch (InvalidFormatException | IOException e) {

			logger.error("InvalidFormatException");
		}
		return cellValue;
	}
}
