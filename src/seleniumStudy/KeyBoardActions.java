package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
    	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
    	 Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		Actions a=new Actions(driver);
//		a.click(day).perform();
//		 Thread.sleep(2000);
//		 for(int i=3;i<10;i++)
//		 {
//	     	a.sendKeys(Keys.ARROW_DOWN).perform();
//	     	Thread.sleep(200); 
//		 }
//		 for(int i=0;i<=10;i++)
//		 {
//			 a.sendKeys(Keys.ARROW_UP);
//			 Thread.sleep(200);
//		 }
//		 a.sendKeys(Keys.ENTER).perform();
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
        a.click(name).keyDown(Keys.SHIFT).sendKeys("h").keyUp(Keys.SHIFT).sendKeys("anumant").build().perform();
        Thread.sleep(2000);
        a.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
       Thread.sleep(1000); 
        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
 	    a.click(email).sendKeys("ahj@123").build().perform();
//   	    a.sendKeys(email,Keys.HOME).perform();
//   	    Thread.sleep(1000);  
   	 
    

	}

}
