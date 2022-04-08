package pomStudy1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pomStudy.POMHomePage;
import pomStudy.POMKiteLoginPage;
import pomStudy.POMPinPage;

public class Test {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("D:\\Selenium\\Practice.xlsx");
		Sheet MySheet = WorkbookFactory.create(f).getSheet("Sheet5");
		int totalRow = MySheet.getLastRowNum();
		int totalCell = MySheet.getRow(0).getLastCellNum()-1;
			
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	     ChromeOptions opt=new ChromeOptions();
	  //   opt.addArguments("incognito");
	    // opt.addArguments("headless");
	   //  opt.addArguments("start-maximized");
	    // opt.addArguments("disable-extensions");
	   //  opt.addArguments("version");

	     

		 WebDriver driver=new ChromeDriver(opt);
	        driver.get("https://kite.zerodha.com/");
	       // driver.manage().window().maximize();
	        Thread.sleep(2000);
	        for(int i=0;i<=totalRow;i++)
			{
	        KiteLogin login=new KiteLogin(driver);
	        login.sendUserId(MySheet.getRow(i).getCell(0).getStringCellValue());
	        login.sendPass(MySheet.getRow(i).getCell(1).getStringCellValue());
	      
	        login.clickLoginButton();
	        Thread.sleep(2000);
	        
	        KitePin pinPage=new KitePin(driver);
	        pinPage.SendPin(MySheet.getRow(i).getCell(2).getStringCellValue());
	        pinPage.clickContinueButton();
	        Thread.sleep(2000);
	        
	        KiteHomePage homePage=new KiteHomePage(driver);
	        homePage.ValidateUserId(MySheet.getRow(i).getCell(0).getStringCellValue());
	        homePage.clickOnLogout();
	        Thread.sleep(2000);
	        
	        KiteChangeuser userChange=new KiteChangeuser(driver);
	        userChange.clickOnChangeUser();
	        Thread.sleep(2000);

		}
	}

}
