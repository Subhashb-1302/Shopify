package com.selenium.setup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.ss.usermodel.*;



public class ExcelUtils {
    
    //Use the below declared variables
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static FileInputStream excelFile;
	private static String filePath;
	

	public static String[] readExcelData(String fileName, String sheetName) throws Exception {
	    
	    //Get the excel file path (note: the excel file is located under 'Shopify/src' directory)  
	    //Using the fileName and sheetName passed to this method
	    
		//read the excel data and store it in a string array
		//return the array. Only one row in the excel sheet so keep 'row' as 0.
	    //Store only the column value in the array.
        filePath ="Shopify//src//" + fileName;

	    excelFile = new FileInputStream(filePath);
	    ExcelWBook = new XSSFWorkbook(excelFile);
	    ExcelWSheet = ExcelWBook.getSheet(sheetName);
	    XSSFRow row = ExcelWSheet.getRow(0);
	    int colNum = row.getLastCellNum();
	    String[] arr = new String[colNum];
	    for(int i=0;i<colNum;i++){
	        arr[i] = row.getCell(i).toString();
	    }
	    return arr;
        
	}

}