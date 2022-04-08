package waitsStudy;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
////StaticWait		
		//Thread.sleep(5000);
//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click(); 
		driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
		WebElement OTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
//ExplicitWait	    
		//WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(2000));
		//w.until(ExpectedConditions.visibilityOf(OTPButton));
		
//FluentWait		
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofMillis(1000))
				  .pollingEvery(Duration.ofMillis(200))
				  .ignoring(NoSuchElementException.class);
		
		OTPButton.click();
	
	}

}
