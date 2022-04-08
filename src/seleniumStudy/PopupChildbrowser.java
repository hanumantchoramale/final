package seleniumStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupChildbrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='New Window']")).click();        
      
        String mainPageWindowid = driver.getWindowHandle();
        System.out.println("Main window id"+mainPageWindowid);
        
        Set<String> allWindowid = driver.getWindowHandles();
        System.out.println("All window id"+allWindowid);
               
        Iterator<String> a = allWindowid.iterator();
        String mainwindow = a.next();
        String firstwindow = a.next();
        driver.switchTo().window(firstwindow);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Hanumant");
        Thread.sleep(2000);
        driver.switchTo().window(mainwindow);
        driver.findElement(By.name("home")).click();
        Thread.sleep(2000);
        driver.quit();
        
        

	}

}
