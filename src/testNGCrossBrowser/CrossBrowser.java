package testNGCrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	@Parameters("browsername")
  @Test
  public void crossBrowser(String browsername) throws InterruptedException
  {
		WebDriver driver=null;
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32//chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			  System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		      driver=new FirefoxDriver();
		}
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		
			
	
  }
}
