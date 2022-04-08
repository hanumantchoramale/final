package seleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumcode {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://vctcpune.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://www.facebook.com/");
      // driver.close();
        Thread.sleep(3000);
      //  driver.quit();
        //driver.manage().window().minimize();
        
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().forward();
//        Thread.sleep(3000);
//        driver.navigate().refresh();
//        driver.navigate().to("https://www.google.co.in/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        
        
        
        
        
        
        

	}

}
