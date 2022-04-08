package seleniumStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedUse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement DisplayElement = driver.findElement(By.name("show-hide"));
		boolean result = DisplayElement.isDisplayed();
		System.out.println("Box is displayed--> "+result);
		WebElement HideButton = driver.findElement(By.id("hide-textbox"));
		HideButton.click();
		boolean result2 = DisplayElement.isDisplayed();
		System.out.println("Box is displayed--> "+result2);
		
	}

}
