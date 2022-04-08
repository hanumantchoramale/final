package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("abc@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("hanu@123");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
	//by locator--->id	
//		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.id("email")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.id("email")).sendKeys("abc11@gmail.com");\]
		
		WebElement Username = driver.findElement(By.id("email"));
		Username.sendKeys("abc@123");
		Thread.sleep(2000);
		Username.clear();
		Thread.sleep(2000);
		Username.sendKeys("xyz@123");
		
		
	
	
	}

}
