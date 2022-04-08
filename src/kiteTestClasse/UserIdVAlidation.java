package kiteTestClasse;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteBaseClasses.Base;
import kitePomClasses.KiteHomePage;
import kitePomClasses.KiteLogin;
import kitePomClasses.KitePinPage;
import kiteUtilityClasses.Utility;

    public class UserIdVAlidation extends Base
    {
	    KiteLogin login;
     	KitePinPage pinpage;
	    KiteHomePage home;
	
	
	@BeforeClass
	public void launchBrowser()
	{
		launchingBrowser();
		login=new KiteLogin(driver);
	    pinpage=new KitePinPage(driver);
	    home=new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException
	{
		
		login.sendUserId(Utility.getValuesFromExcel(0, 0));
		login.sendPass(Utility.getValuesFromExcel(0, 1));
		login.clickOnLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pinpage.sendPin(Utility.getValuesFromExcel(0, 2));
		pinpage.clickOnContinue();				
	}
	
	@Test
    public void validateUserId() throws EncryptedDocumentException, IOException
	{
		int TCID=100;
		String expectedUserId = Utility.getValuesFromExcel(0, 0);
		String actualUserID = home.ValidateUserId();
		Assert.assertEquals(expectedUserId, actualUserID," UserId Not Matching");
		Utility.screenShot(driver,100);		
    }
	@AfterMethod
	public void logout()
	{
		home.clickOnLogout();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
