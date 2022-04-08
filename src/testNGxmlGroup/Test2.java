package testNGxmlGroup;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	  @Test(groups="Sanity")
	  public void TC6() 
	  {
		  Reporter.log("TC6 Running",true);
	  }
	  @Test(groups="reg")
	  public void TC7() 
	  {
		  Reporter.log("TC7 Running",true);
	  }
	  @Test(groups="Sanity")
	  public void TC8() 
	  {
		  Reporter.log("TC8 Running",true);
	  }
	  @Test
	  public void TC9() 
	  {
		  Reporter.log("TC9 Running",true);
	  }
	  @Test(groups="reg")
	  public void TC10() 
	  {
		  Reporter.log("TC10 Running",true);
	  }

}
