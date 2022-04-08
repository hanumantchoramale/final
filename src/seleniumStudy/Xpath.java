package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
//xpath by attribute
		
//		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("abc@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("xyz@123");
//
//		Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[@href='/forgot']")).click();
//        Thread.sleep(3000);
//        driver.manage().window().minimize();
		
 //xpath by text 
        
        driver.get("https://vctcpune.com/");
        Thread.sleep(2000);
        
        driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//h1[text()='Practice Page']"));
	    driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));
	    
//xpath by contains
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Training Center')]"));
	    driver.findElement(By.xpath("//a[contains(@class,'navbar-brand')]"));
	   
// xpath by index
	    
	    driver.findElement(By.xpath("(//input[@name='radio'])[3]"));
	    driver.findElement(By.xpath("(//h1[contains(text(),'Practice Page')])[2]"));
	    
	    
	    
	    
	    
	    
	    
	
	
	
	}
}
