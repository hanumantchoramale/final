package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlterWayOfRefresh {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.google.co.in/");
         WebElement search = driver.findElement(By.name("q"));
         Thread.sleep(1000);
 //1.        driver.navigate().refresh();
         
         String url = driver.getCurrentUrl();
 //2.        driver.navigate().to(url);
         
         Actions a=new Actions(driver);
  //       a.sendKeys(Keys.F5).build().perform();
         
         JavascriptExecutor js=(JavascriptExecutor)driver;
 //5.         js.executeScript("window.location.reload()");
         
	}

}
