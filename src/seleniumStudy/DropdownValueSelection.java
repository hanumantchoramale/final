package seleniumStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownValueSelection {

	public static void main(String[] args) throws InterruptedException {
	
		    System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
			Thread.sleep(2000);
		    List<WebElement>  Month = driver.findElements(By.xpath("//select[@name='birthday_month']//option"));
              System.out.println(Month.get(0).getText()); 
          	System.out.println(Month.size());
              Thread.sleep(2000);
		      for(int i=0;i<Month.size();i++ )
		      {
		    	if(Month.get(i).getText().contains("Jul"))
		    	{
		    		WebElement july = Month.get(i);
		    		july.click();
		    		break;
	    	
		    	}	    	
		      }

	}

}
