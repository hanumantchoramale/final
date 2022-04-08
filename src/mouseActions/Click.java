package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement checkBoxButton3 = driver.findElement(By.id("checkBoxOption3"));
		Actions a=new Actions(driver);
//1st way		
		//a.click(checkBoxButton3).perform();
		
//2nd way
		a.moveToElement(checkBoxButton3).click().build().perform();
		
	}

}
