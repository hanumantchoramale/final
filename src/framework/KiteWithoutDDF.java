package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteWithoutDDF {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://kite.zerodha.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        WebElement userIdField = driver.findElement(By.id("userid"));
	        WebElement passFild = driver.findElement(By.id("password"));
	        userIdField.sendKeys("DAA677");
	        passFild.sendKeys("Velocity@123");
	        driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	        Thread.sleep(1000);
	        WebElement pinField = driver.findElement(By.id("pin"));
	        pinField.sendKeys("866918");
	        driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	        Thread.sleep(1000);
	        WebElement accountName = driver.findElement(By.xpath("//span[@class='user-id']"));
	        String actualText = accountName.getText();
            String expectedText = "DAA677";
            if(actualText.equals(expectedText))
            {
            	System.out.println("Text matches TC Pass");
            }
            else
            {
            	System.out.println("Text not matches TC Fail");
            }
            
             accountName.click();
             driver.findElement(By.xpath("//a[@target='_self']")).click();
             driver.close(); 
             
             
	        

	}

}
