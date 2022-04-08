package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords2 {
	//@Test execute alphabetic sequence
	
	  @Test
	  public void a()
	  {
		Reporter.log("@Test a ",true); 
	  }
	  
	  @Test(dependsOnMethods = {"ab"})
	  public void abc()
	  {
		  Reporter.log("@Test abc ",true); 
	  }
	  
	  @Test(timeOut = 1000)
	  public void abcd() throws InterruptedException
	  {
		  Thread.sleep(2000);
		  Reporter.log("@Test abcd ",true); 
	  }
	  
	  @Test
	  public void ab()
	  {
		  Reporter.log("@Test ab ",true); 
	  }
}
