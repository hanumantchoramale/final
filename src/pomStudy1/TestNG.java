package pomStudy1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
 
	WebDriver driver; String userId;
	String pass; String pin;
	
  @BeforeClass
  public void launchBrowser() throws EncryptedDocumentException, IOException
  {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://kite.zerodha.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	   FileInputStream f=new FileInputStream("D:\\Selenium\\Practice.xlsx");
		Sheet MySheet = WorkbookFactory.create(f).getSheet("Sheet4");
	   userId=MySheet.getRow(0).getCell(0).getStringCellValue();
       pass=MySheet.getRow(0).getCell(1).getStringCellValue();
       pin=MySheet.getRow(0).getCell(2).getStringCellValue();
  }
  @BeforeMethod
  public void loginPage() 
  {
	  
	  KiteLogin login=new KiteLogin(driver);
	  login.sendUserId(userId);
	  login.sendPass(pass);
	  login.clickLoginButton();
	  Reporter.log("Login Succesfull",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  KitePin pinPage=new KitePin(driver);
	  pinPage.SendPin(pin);
	  pinPage.clickContinueButton();
	  Reporter.log("Pin Added Succesfull",true);
	  
  }
  @Test
  public void validateUserId() throws InterruptedException
  {
	  KiteHomePage homePage=new KiteHomePage(driver);
	  homePage.ValidateUserId(userId);
	  homePage.clickOnLogout();
	  Reporter.log("Validation of userId Succesfull",true);
  }
}
















