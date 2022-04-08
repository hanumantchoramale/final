package seleniumStudy;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.RandomAccess;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
       
	      File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      String name = RandomString.make(2); 
//	      Random a=new Random();
//	      int name = a.nextInt(3);
	      
	     File destination=new File("D:\\Selenium\\ScreenShots\\han u"+name+".png");
	     FileHandler.copy(source, destination);
	    
    

	}

}
