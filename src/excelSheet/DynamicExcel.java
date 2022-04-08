package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DynamicExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("D:\\Selenium\\Practice.xlsx");
		Sheet MySheet = WorkbookFactory.create(f).getSheet("Sheet1");
		
		//Dynamic testing	
		
			int lastRowNum = MySheet.getLastRowNum();
				System.out.println(lastRowNum);
				int totalNumberOfRows = lastRowNum;
				
				short lastCellNum = MySheet.getRow(0).getLastCellNum();
				System.out.println(lastCellNum);
				int totalNumberOfCells = lastCellNum-1;
				
				for(int i=0;i<=totalNumberOfRows;i++)
				{
					for(int j=0;j<=totalNumberOfCells;j++)
					{
						String value = MySheet.getRow(i).getCell(j).getStringCellValue();
						System.out.print(value+" ");
					}
					System.out.println();
				}
				System.out.println(MySheet.getRow(0).getCell(0));

	}

}
