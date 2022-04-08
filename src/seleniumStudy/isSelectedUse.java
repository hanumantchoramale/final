package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedUse {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.instagram.com/");
//        driver.manage().window().maximize();
//        Thread.sleep(2000);
//        WebElement Username = driver.findElement(By.name("username"));
//        Username.sendKeys("Hanumant");
//        Thread.sleep(2000);
//        Username.clear();  //clear() not work in insta
//        Thread.sleep(2000);
//        Username.sendKeys("Hanu123");
        driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
       WebElement Select = driver.findElement(By.id("checkBoxOption1"));
        boolean Status = Select.isSelected();
        System.out.println("Option1 is select--> "+Status);
        
        if(Status)
        {
        	System.out.println("Option1 is select");
        }
        else
        {
        	Select.click();
        	Thread.sleep(2000);
        	boolean Status1 = Select.isSelected();
        	System.out.println("Option1 is select--> "+Status1);
        	
        	
        	
        }
        
	}

}
