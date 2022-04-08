package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlterWayOfsendkeys {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.google.co.in/");
         WebElement search = driver.findElement(By.name("q"));
  //1       search.sendKeys("Sendkeys");
         
         JavascriptExecutor js = (JavascriptExecutor)driver;
  //2.       js.executeScript("arguments[0].value='sendkey'", search);
         
         Actions a=new Actions(driver);
   //3.      a.sendKeys(search, "sendkeys").perform();
   //4.robot class      
	}

}
