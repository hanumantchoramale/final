package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SingeleValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		FileInputStream f=new FileInputStream("D:\\Selenium\\Excel.xlsx");
        
		//String value = WorkbookFactory.create(f).getSheet("Sheet3").getRow(0).getCell(0).getStringCellValue();
	   // System.out.println(value);
	    
//	    double value1 = WorkbookFactory.create(f).getSheet("sheet3").getRow(0).getCell(1).getNumericCellValue();
//	    System.out.println(value1);
	    
	    Workbook test1 = WorkbookFactory.create(f);
	    Sheet test2 = test1.getSheet("Sheet3");
	    Row test3 = test2.getRow(0);
	    Cell test4 = test3.getCell(0);
	    String test = test4.getStringCellValue();
	    System.out.println(test);
	    
	    System.out.println(test2.getRow(0).getCell(1).getStringCellValue());
	    System.out.println(test2.getRow(0).getCell(2).getStringCellValue());
	    
	    
	
	}

}

