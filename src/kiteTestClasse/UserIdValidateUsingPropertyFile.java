package kiteTestClasse;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteBaseClasses.BaseClassWithProperty;
import kitePomClasses.KiteHomePage;
import kitePomClasses.KiteLogin;
import kitePomClasses.KitePinPage;
import kiteUtilityClasses.Utility;
import kiteUtilityClasses.UtilityWithProprty;

public class UserIdValidateUsingPropertyFile  extends BaseClassWithProperty {

	    KiteLogin login;
     	KitePinPage pinpage;
	    KiteHomePage home;
	    int TCID=102;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		launchingBrowser();
		login=new KiteLogin(driver);
	    pinpage=new KitePinPage(driver);
	    home=new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException
	{
		
		login.sendUserId(UtilityWithProprty.getValueFromPropertyFile("USER"));
		login.sendPass(UtilityWithProprty.getValueFromPropertyFile("PSW"));
		login.clickOnLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pinpage.sendPin(UtilityWithProprty.getValueFromPropertyFile("PIN"));
		pinpage.clickOnContinue();				
	}
	
	@Test
    public void validateUserId() throws EncryptedDocumentException, IOException
	{
		String expectedUserId = UtilityWithProprty.getValueFromPropertyFile("USER");
		String actualUserID = home.ValidateUserId();
		Assert.fail();
		Assert.assertEquals(expectedUserId, actualUserID," UserId Not Matching");
	//	UtilityWithProprty.screenShot(driver,TCID);		
    }
	@AfterMethod
	public void logout(ITestResult Result) throws IOException
	{//TC fail then takes SC
		
		//if(Result.getStatus()==Result.FAILURE)
		if(Result.isSuccess())
		{
			
			Reporter.log("TC is passed",true);
		}
		else
		{
			UtilityWithProprty.screenShot(driver,TCID);	
		}
		home.clickOnLogout();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	}
	
