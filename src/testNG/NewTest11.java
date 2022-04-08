package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest11 {
  @Test
  public void f() 
  {
	  Reporter.log("Launching FirefoxBrowse",true);
	  System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
      WebDriver driver=new FirefoxDriver();
      Reporter.log("Browse Launch Successfully",true);
  
   driver.get("https://kite.zerodha.com/");
   driver.manage().window().maximize();
  }
}
