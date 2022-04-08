package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;
import org.testng.annotations.Test;

public class FirefoxBrowser {
  @Test
  public void f() throws InterruptedException 
  {
	  System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");

      WebDriver driver=new FirefoxDriver();
      driver.get("https://www.flipkart.com/");
      Thread.sleep(2000);
  }
}
 