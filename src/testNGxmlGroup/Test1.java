package testNGxmlGroup;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test(groups="reg")
	  public void TC1() 
	  {
		  Reporter.log("TC1 Running",true);
	  }
	  @Test(groups="Sanity")
	  public void TC2() 
	  {
		  Reporter.log("TC2 Running",true);
	  }
	  @Test
	  public void TC3() 
	  {
		  Reporter.log("TC3 Running",true);
	  }
	  @Test(groups="reg")
	  public void TC4() 
	  {
		  Reporter.log("TC4 Running",true);
	  }
	  @Test(groups="Sanity")
	  public void TC5() 
	  {
		  Reporter.log("TC5 Running",true);
	  }
}
