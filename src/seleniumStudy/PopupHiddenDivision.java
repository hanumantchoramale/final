package seleniumStudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class PopupHiddenDivision {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement popup = driver.findElement(By.xpath("//button[text()='✕']"));
        Thread.sleep(2000);
        boolean Result = popup.isDisplayed();
        if(Result) {
        	System.out.println("Popup displayed");
          popup.click();
        }
        else
        {
        	System.out.println("Popup not displayed");
        }
        driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
        Thread.sleep(2000);
        
        for(int i=1;i<=3;i++)
        {
        File s1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String name = RandomString.make(2);
        File s2=new File("D:\\\\Selenium\\\\ScreenShots\\\\hanu"+name +".png");
        FileHandler.copy(s1, s2);
        Thread.sleep(2000);
        }

       

	}

}
