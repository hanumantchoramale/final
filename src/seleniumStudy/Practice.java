package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame("frame-one1434677811");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Hanumant");
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Choramale");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("9561238149");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("India");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Velapur");
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_1']")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_2']")).click();
        
        WebElement BestTimeDropdown = driver.findElement(By.id("RESULT_RadioButton-9"));
        Select s=new Select(BestTimeDropdown);
        s.selectByVisibleText("Morning");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		WebElement copyButton = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		System.out.println(copyButton.getText());
		
		
		
		
		
	}
}
