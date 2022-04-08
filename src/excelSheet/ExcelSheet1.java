package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("D:\\Selenium\\Excel.xlsx");
//Static Coding
		Sheet MySheet = WorkbookFactory.create(f).getSheet("Sheet3");
		for(int i=0;i<=1;i++)//for rows
		{
			for(int j=0;j<=2;j++)//for column
			{
		       String text = MySheet.getRow(i).getCell(j).getStringCellValue();
		       System.out.print(text+" ");
			}
			System.out.println();
		}
///
		System.out.println(MySheet.getRow(0).getCell(0).getCellType());
		System.out.println(MySheet.getRow(0).getCell(1).getCellType());
		System.out.println(MySheet.getRow(0).getCell(2).getCellType());
		System.out.println(MySheet.getRow(1).getCell(0).getCellType());
		System.out.println(MySheet.getRow(1).getCell(1).getCellType());
		System.out.println(MySheet.getRow(1).getCell(2).getCellType());
		
		System.out.println(MySheet.getRow(0).getCell(0).getStringCellValue());
		MySheet.getRow(0).getCell(1);
		MySheet.getRow(0).getCell(2);
		MySheet.getRow(1).getCell(0);
		MySheet.getRow(1).getCell(1);
		MySheet.getRow(1).getCell(2);
	}

}
