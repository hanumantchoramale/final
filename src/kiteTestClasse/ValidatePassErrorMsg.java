package kiteTestClasse;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteBaseClasses.Base;
import kitePomClasses.KiteLogin;
import kiteUtilityClasses.Utility;

public class ValidatePassErrorMsg extends Base {
	KiteLogin login;
	@BeforeClass
	public void launchBrowser()
	{
		launchingBrowser();
		login=new KiteLogin(driver);
	}
	
	@BeforeMethod
	public void validateUserError() throws EncryptedDocumentException, IOException
	{
		login.sendUserId(Utility.getValuesFromExcel(0, 0));
		login.clickOnLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	} 
	
  @Test
  public void ValidateError() throws EncryptedDocumentException, IOException 
  
  {
	  int TCID=10;
	  String Actual = login.getpassErrorMsg();
	  String expected = Utility.getValuesFromExcel(0, 3);
	  Assert.assertEquals(Actual, expected,"Error Msg not Match");
	  Utility.screenShot(driver,TCID);	  	  
  }
  
  @AfterClass
  public void browserClose()
  {
	  driver.close();
  }
}
