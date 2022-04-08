package testNGSeriesParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	  public void MyMethod1() throws InterruptedException
	  {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32//chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://demoqa.com/select-menu");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.close();
	  }
}
