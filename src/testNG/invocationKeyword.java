package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationKeyword {
	//@Test execute alphabetic sequence
	
  @Test(invocationCount = 2)   //2 times execute
  public void a()
  {
	Reporter.log("@Test a ",true); 
  }
  
  @Test
  public void abc()
  {
	  Reporter.log("@Test abc ",true); 
  }
  
  @Test(priority = -1)   //1st execute
  public void ab()
  {
	  Reporter.log("@Test ab ",true); 
  }
  
  @Test(enabled = false) //disable..not execute
  public void abcd()
  {
	  Reporter.log("@Test abcd ",true); 
  }


}
