package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement element = driver.findElement(By.id("userid"));
       // JavaScriptUtil.flash(driver, element);
       // JavaScriptUtil.border(driver, element);
		String title = JavaScriptUtil.getTitleByJS(driver); //driver.gettitle
		System.out.println(title);   
		
	}

}
