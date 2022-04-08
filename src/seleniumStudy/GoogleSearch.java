package seleniumStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.google.co.in/");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Honda");
	        Thread.sleep(2000);
	        List<WebElement> options = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]//li"));
	        System.out.println(options.size());
	        for(WebElement w:options)
	        {
	        	System.out.println(w.getText());
	        }
	        
	        for(int i=0;i<=options.size();i++)
	        {
	        	if(options.get(i).getText().contains("amaze"))
	        	{
	        		WebElement amaze = options.get(i);
	        		amaze.click();
	        		break;
	        	}
	        }
	
	}

}
