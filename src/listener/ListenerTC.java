package listener;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listener.Listener.class)
public class ListenerTC {
  @Test
  public void a() 
  {
	  Reporter.log("TC a is running",true);
  }
  @Test
  public void b() 
  {
	  fail();
	  Reporter.log("TC b is running",true);
  }
  @Test(dependsOnMethods = {"b"})
  public void c() 
  {
	  Reporter.log("TC c is running",true);
  }
}
