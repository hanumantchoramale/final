package textNGfail;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

import net.jodah.failsafe.internal.util.Assert;

public class test1 {
  @Test
  public void TC1()
  {
	  Reporter.log("TC1 Running ");
  }
  @Test
  public void TC2()
  {
	  Reporter.log("TC2 Running ");
  }
  @Test(timeOut =500)
  public void TC3() throws InterruptedException
  {
	  Thread.sleep(100);
	  Reporter.log("TC3 Running ");
  }
  @Test(timeOut =500)
  public void TC4() throws InterruptedException
  {
	  Thread.sleep(100);
	  Reporter.log("TC4 Running ");
  }
  @Test
  public void TC5()
  {
	  Reporter.log("TC5 Running ");
  }
  @Test
  public void TC6()
  {
	  Reporter.log("TC6 Running ");
  }

}
