package com.automation.ui.base.common.utils;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.DateUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.*;
import java.util.ArrayList;
import java.util.*;

import java.text.*;

public class ExcelUtil {

    private static Logger logger = Logger.getLogger(ExcelUtil.class);
    private Sheet datatypeSheet;

    static Map<String, Workbook> workbooktable = new HashMap<String, Workbook>();
    public static Map<String, Integer> dict = new Hashtable<String, Integer>();
    public static List list = new ArrayList();

    /**
     * To get the excel sheet workbook
     */
    public static Workbook getWorkbook(String path) {
        Workbook workbook = null;
        if (workbooktable.containsKey(path)) {
            workbook = workbooktable.get(path);
        } else {

            try {


                File file = new File(path);

                workbook = WorkbookFactory.create(file);

                workbooktable.put(path, workbook);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
                logger.info("FileNotFoundException" + e);
            } catch (InvalidFormatException e) {
                e.printStackTrace();
                logger.info("InvalidFormatException" + e);
            } catch (IOException e) {
                e.printStackTrace();
                logger.info("IOException" + e);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return workbook;
    }

    /**
     * To get the number of sheets in test data sheet
     */
    public static List<String> getNumberOfSheetsinTestDataSheet(String testPath) {
        List<String> listOfSheets = new ArrayList<String>();

        Workbook workbook = getWorkbook(testPath);
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            //if (!(workbook.getSheetName(i)).equalsIgnoreCase(config
                 //   .getConfigValues("TestCase_SheetName")))
            {
                listOfSheets.add(workbook.getSheetName(i));

            }
        }
        return listOfSheets;

    }

    /**
     * Get the total rows present in excel sheet
     */
    public static int getRows(String testSheetName, String pathOfFile)
            throws InvalidFormatException, IOException {
        Workbook workbook = getWorkbook(pathOfFile);

        Sheet sheet = workbook.getSheet(testSheetName);

        return sheet.getLastRowNum();

    }

    /**
     * Get the column names inside excel sheet
     */
    public static List getColumnNames(String testSheetName, String pathOfFile,
                                      int j) throws InvalidFormatException, IOException {
        Workbook workbook = getWorkbook(pathOfFile);
        Sheet sheet = workbook.getSheet(testSheetName);

        for (int i = 0; i <= j; i++) {
            if (sheet.getRow(0).getCell(i) != null) {
                list.add(sheet.getRow(0).getCell(i).getStringCellValue()
                        .toString());
            }
        }

        return list;

    }

    /**
     * Get the total number of rows for each column inside excel sheet
     */
    public static void getNumberOfRowsPerColumn(String testSheetName,
                                                String pathOfFile, int j) throws InvalidFormatException,
            IOException {
        Workbook workbook = getWorkbook(pathOfFile);
        Sheet sheet = workbook.getSheet(testSheetName);
        int totColumns = sheet.getRow(0).getLastCellNum();
        for (int i = 0; i <= totColumns; i++) {
            if (sheet.getRow(0).getCell(i) != null) {
                list.add(sheet.getRow(0).getCell(i).getStringCellValue()
                        .toString());
            }
        }
    }


    /**
     * Get the total columns inside excel sheet
     */
    public static int getColumns(String testSheetName, String pathOfFile)
            throws InvalidFormatException, IOException {
        Workbook workbook = getWorkbook(pathOfFile);

        Sheet sheet = workbook.getSheet(testSheetName);
        return sheet.getRow(0).getLastCellNum();

    }


    /**
     * To clear the worktable and list
     */
    public void clean() {
        workbooktable.clear();
        list.clear();
    }

    /**
     * Read the content of the cell
     */
    public static String readCell(int rowNum, int colNum, String testSheetName,
                                  String pathOfFile) {
        Workbook workbook;
        String cellValue = null;

        workbook = getWorkbook(pathOfFile);
        Sheet sheet = workbook.getSheet(testSheetName);
        Row row = sheet.getRow(rowNum);
        if (row != null) {
            Cell cell = row.getCell(colNum);
            if (cell != null) {
                DataFormatter dataFormatter = new DataFormatter();
                String data = dataFormatter.formatCellValue(cell);
                cellValue = data;
            }
        }
        return cellValue;
    }

    /**
     * This method is to read the test data from the Excel cell, in this we are
     * // passing parameters as Row num and Col num
     */

    public void setExcelFile(String filePath, String sheetName)
            throws Exception {

        try {

            // Open the Excel file
            File f = new File(filePath);
            FileInputStream excelFile = new FileInputStream(filePath);

            // Access the required test data sheet
            Workbook workbook = null;
            if (filePath.endsWith("xlsx")) {
                workbook = new XSSFWorkbook(excelFile);
            } else if (filePath.endsWith("xls")) {
                workbook = new HSSFWorkbook(excelFile);
            } else {
                throw new IllegalArgumentException(
                        "The specified file is not Excel file");
            }


            this.datatypeSheet = workbook.getSheet(sheetName);

            //logger.info("Reading the excel file ::" + filePath + " and sheetname ::" + sheetName + "datatypeSheet" + datatypeSheet);

        } catch (Exception e) {
            e.printStackTrace();

            throw (e);

        }

    }

    public void setExcelSheetById(String filePath, int sheetNo)
            throws Exception {

        try {

            // Open the Excel file
            File f = new File(filePath);
            FileInputStream excelFile = new FileInputStream(filePath);

            // Access the required test data sheet
            Workbook workbook = null;
            HSSFSheet mySheet = null;
            if (filePath.endsWith("xlsx")) {
                workbook = new XSSFWorkbook(excelFile);
            } else if (filePath.endsWith("xls")) {
                workbook = new HSSFWorkbook(excelFile);
                /** Get the first sheet from workbook**/
                mySheet = (HSSFSheet) workbook.getSheetAt(sheetNo);
            } else {
                throw new IllegalArgumentException(
                        "The specified file is not Excel file");
            }


            this.datatypeSheet = mySheet;

            logger.info("Reading the excel file ::" + filePath + " and sheetNo ::" + sheetNo + "datatypeSheet" + datatypeSheet);

        } catch (Exception e) {
            e.printStackTrace();

            throw (e);

        }

    }

    public List<String> getNumberOfSheetsinSuite(String filePath) {
        List<String> listOfSheets = new ArrayList<String>();

        try {
            Workbook workbook = WorkbookFactory
                    .create(new File(filePath));
            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {

            }

        } catch (InvalidFormatException | IOException e) {

            logger.info(e.getMessage());
        }
        return listOfSheets;

    }


    public String getCellData(int rowNum, int colNum) throws Exception {

        String cellData = "";
        try {


            if (null != this.datatypeSheet.getRow(rowNum).getCell(colNum)) {
                switch (this.datatypeSheet.getRow(rowNum).getCell(colNum).getCellType())
                {
                    case Cell.CELL_TYPE_STRING:
                        cellData=this.datatypeSheet.getRow(rowNum).getCell(colNum).getStringCellValue() ;
                        break;

                    case Cell.CELL_TYPE_NUMERIC:

                        if (DateUtil.isCellDateFormatted(this.datatypeSheet.getRow(rowNum).getCell(colNum))) {
                            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                            cellData= dateFormat.format(this.datatypeSheet.getRow(rowNum).getCell(colNum).getDateCellValue());
                        } else {

                            long i = (int)this.datatypeSheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
                            cellData = String.valueOf(i);
                        }
                        break;
                   case Cell.CELL_TYPE_FORMULA:
                        cellData=this.datatypeSheet.getRow(rowNum).getCell(colNum).getCellFormula();
                        break;
                    case Cell.CELL_TYPE_BLANK:
                    cellData="";
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        // cellData=this.datatypeSheet.getRow(rowNum).getCell(colNum).getBooleanCellValue();
                        break;
                }

            }



        } catch (Exception e) {

            logger.info("InvalidFormatException while reading excel");
        }
        finally {
            return cellData;
        }


    }

}