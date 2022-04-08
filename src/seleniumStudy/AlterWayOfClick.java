package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterWayOfClick {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.cricbuzz.com/");
	     Dimension size = driver.manage().window().getSize();
	      WebElement Score = driver.findElement(By.xpath("//a[text()='Live Scores']"));
      //   Score.click(); 
      //   Score.sendKeys(Keys.ENTER);
      //   Score.sendKeys(Keys.RETURN);
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	   //  js.executeScript("arguments[0].click()",Score);
	     js.executeScript("arguments[0].resize(100,200);",size);
	     
	}

}
