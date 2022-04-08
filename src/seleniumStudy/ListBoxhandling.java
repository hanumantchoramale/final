package seleniumStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxhandling {

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
		 s.selectByIndex(19);
		
		System.out.println();
		 Thread.sleep(2000);
		 
		 WebElement Month = driver.findElement(By.name("birthday_month"));
		 Select s1=new Select(Month);
		 s1.selectByVisibleText("Jul");
		 Thread.sleep(2000);
		 
		 WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));
		 Select s2=new Select(Year);
		 s2.selectByValue("1995");
		 Thread.sleep(2000);
		 
		 
		 

	}

 }
