package kiteUtilityClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hpsf.Property;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityWithProprty {
	public static void screenShot(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Selenium\\ScreenShots\\TC"+TCID+"ScreenShot.png");
		FileHandler.copy(src, dest);
		Reporter.log("ScreenShot taken for TC"+TCID,true);
		
	}
	
	public static String getValueFromPropertyFile(String key) throws IOException
	{
		Properties p=new Properties();
		FileInputStream f=new FileInputStream("C:\\Users\\Dell.DESKTOP-HFEDGTF\\eclipse-workspace\\11th_Dec_B\\Property.property");
		p.load(f);
		String value =p.getProperty(key);		
		return value;	
	}
}
