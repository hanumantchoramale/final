package pomWithTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGCrossBrowser {
 
	WebDriver driver;
	Sheet MySheet;
	KiteLogin login;
    KitePin pinpage;
    KiteHomePage homepage;
    
  @Parameters("browserName")
  @BeforeClass
  public void launchBrowser(String browser) throws EncryptedDocumentException, IOException, InterruptedException
  {
		if(browser.equals("chrome"))
		{
			Reporter.log("Launching chrome Browse",true);
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32//chromedriver.exe");
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disable-notifications");
			driver=new ChromeDriver(opt);
		    Reporter.log("Launch chrome Browse",true);
		}
		else if(browser.equals("firefox"))
		{
			  Reporter.log("Launching firefox Browse",true);
			  FirefoxOptions opt=new FirefoxOptions();
			  opt.addArguments("--disable-notifications");
			  System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		      driver=new FirefoxDriver();
			  Reporter.log("Launch firefox Browse",true);

		}
	   driver.get("https://kite.zerodha.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	   FileInputStream f=new FileInputStream("D:\\Selenium\\Practice.xlsx");
	   MySheet = WorkbookFactory.create(f).getSheet("Sheet4");
	   login=new KiteLogin(driver);
	   pinpage=new KitePin(driver);
	   homepage=new KiteHomePage(driver);
	   
  }
  @BeforeMethod
  public void loginPage() 
  {
	  String userId = MySheet.getRow(0).getCell(0).getStringCellValue();
      String pass = MySheet.getRow(0).getCell(1).getStringCellValue();
      String pin = MySheet.getRow(0).getCell(2).getStringCellValue();
      Reporter.log("Entering Username and Password",true);
      login.sendUserId(userId);
	  login.sendPass(pass);
	  login.clickLoginButton();
	  Reporter.log("Login Succesfull",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  Reporter.log("Entering Pin",true);
	  pinpage.SendPin(pin);
	  pinpage.clickContinueButton();
	  Reporter.log("Pin Added Succesfull",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

  }
  @Test
  public void validateUserId() throws InterruptedException
  {
	  Reporter.log("Validating UserId",true);
	  String expectedUserId = MySheet.getRow(0).getCell(0).getStringCellValue();
	  String actualUserId = homepage.getActualUserId(); 
	  Assert.assertEquals(expectedUserId, actualUserId);
	  Reporter.log("Validating UserId Successfully,TC pass",true);

  }
  @AfterMethod
  public void logout() throws InterruptedException
  {
	  Reporter.log("LoggingOut..",true);
	  homepage.clickOnLogout();
  }
  @AfterClass
  public void windowClose()
  {	 
	  Reporter.log("closingBrowser",true);
	  driver.close();
  }
}
















