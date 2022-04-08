package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NumberOfElementsDropdown {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
			Thread.sleep(2000);
			
			 WebElement Day = driver.findElement(By.id("day")) ;
			 Select s=new Select(Day);
			 int numberOfElements = s.getOptions().size();
			 System.out.println("Total number of elements in Dropdown-->  "+numberOfElements);

	}

}
