package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement clickButton= driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		Actions a=new Actions(driver);
//1st way		
		a.doubleClick( clickButton).perform();
		
//2nd way
		//a.moveToElement( clickButton).doubleClick().build().perform();
	}

}
