package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("D:\\Selenium\\Practice.xlsx");
		Sheet MySheet = WorkbookFactory.create(f).getSheet("Sheet3");
		int totalNumberOfRows = MySheet.getLastRowNum();
		int totalNumberOfCells = MySheet.getRow(0).getLastCellNum()-1;
		for(int i=0;i<=totalNumberOfRows;i++)
		{
			for(int j=0;j<=totalNumberOfCells;j++)
			{
				 Cell info = MySheet.getRow(i).getCell(j);
				 CellType type = info.getCellType();
				 if(type==CellType.STRING)
				 {
					 String value = info.getStringCellValue();
					 System.out.print(value+" ");
				 }
				 else if(type==CellType.NUMERIC)
				 {
					 double value = info.getNumericCellValue();
					 System.out.print(value+" ");
				 }
				 else if(type==CellType.BOOLEAN)
				 {
					 boolean value = info.getBooleanCellValue();
					 System.out.print(value+" ");
				 }
				 else if(type==CellType.BLANK)
				 {
					  System.out.println(info);
				 }
			}
			System.out.println();
			
		}


	}

}
