package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTest {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement getText = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
	//	System.out.println(getText.getText());
		String ActualText = getText.getText();
		System.out.println("Actual Text is--> "+ActualText);
		String ExpectedText = "Facebook helps you connect";
		
		if(ActualText.equals(ExpectedText))
		{
			System.out.println("Text matching, Test case is pass");
		}
		else
		{
			System.out.println("Text not matching, Test case is fail");
		}

	}


}