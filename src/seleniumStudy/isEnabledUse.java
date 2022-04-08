package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledUse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(2000);
		WebElement OTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
   //   System.out.println(OTPButton.isEnabled());
		boolean Result = OTPButton.isEnabled();
		System.out.println("Get OTP button status is "+Result);
		if(Result)
		{
			System.out.println("Get OTP button is Enable");
			OTPButton.click();
		}
		else
		{
			driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
			OTPButton.click();
			System.out.println("Clicked on Get OTP button");
		}
	}

}
