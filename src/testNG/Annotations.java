package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
  @Test
  public void ValidateUserId()
  {
	  System.out.println("@Test Method");
	  Reporter.log("@Test Method1");
  }
  
  @Test                     //@test execute alphabetically
  public void abc()
  {
	 	  Reporter.log("@Test Method2",true);
  }
  @BeforeMethod
  public void login()
  {
	  Reporter.log("@Before Method",true);
  }
  
  @AfterMethod
  public void logOut()
  {
	  Reporter.log("@After Method",true);
  }
  
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("@Before Class",true);
  }
  
  @AfterClass
  public void browserClose()
  {
	  Reporter.log("@After Class",true);
  }
  
}
