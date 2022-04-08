package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize_position {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
  //Set size      
         Dimension defaultsize=driver.manage().window().getSize();
         System.out.println("Default size "+defaultsize);
     
         
//         Dimension d=new Dimension(500, 300);
//         driver.manage().window().setSize(d);
  //Set position    
         
         Point p=new Point(100,200);
    //     driver.manage().window().setPosition(p);
        
         WebElement searchBox = driver.findElement(By.name("q"));
         System.out.println("Default size "+searchBox.getSize());
         
         
         
         JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("window.resizeTo(100,200)");
         System.out.println("Default size "+searchBox.getSize());
         
         
         

	}

}
