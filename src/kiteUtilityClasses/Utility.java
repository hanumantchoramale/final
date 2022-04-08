package kiteUtilityClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import javaScriptExecutor.JavaScriptUtil;

public class Utility 
{
	static Sheet mySheet;
	public static String getValuesFromExcel(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile=new FileInputStream("D:\\Selenium\\Practice.xlsx");
	    mySheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
	    String value = mySheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	    return value;
	}
	
	public static void screenShot(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Selenium\\ScreenShots\\TC"+TCID+"ScreenShot.png");
		FileHandler.copy(src, dest);
		Reporter.log("ScreenShot taken for TC"+TCID,true);
		
	}

}
