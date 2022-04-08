package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxMultiselect {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        WebElement MultiSelectBox = driver.findElement(By.id("cars"));
        Select h=new Select(MultiSelectBox);
        boolean result = h.isMultiple();
        System.out.println("It is multiSelect box--> "+result);
        h.selectByIndex(1);
        Thread.sleep(2000);
        h.selectByVisibleText("Audi");
        Thread.sleep(2000);
        h.selectByValue("volvo");
        h.selectByVisibleText("Opel");
        Thread.sleep(2000);
        h.deselectByVisibleText("Audi");
        Thread.sleep(2000);
        h.deselectByIndex(0);
        Thread.sleep(2000);
        h.deselectAll();
        
        
        
        

	}

}
