package kiteBaseClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base 
{
	protected WebDriver driver;
	public void launchingBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		Reporter.log("Browser launch Successfully",true);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
	public void closeBrowser()
	{
		driver.close();
		Reporter.log("Browser close Successfully",true);
	}

}
