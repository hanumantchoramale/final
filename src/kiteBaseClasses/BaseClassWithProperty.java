package kiteBaseClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import kiteUtilityClasses.UtilityWithProprty;

public class BaseClassWithProperty {
	protected WebDriver driver;
	public void launchingBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		Reporter.log("Browser launch Successfully",true);
		driver.get(UtilityWithProprty.getValueFromPropertyFile("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
	public void closeBrowser()
	{
		driver.close();
		Reporter.log("Browser close Successfully",true);
	}
}
