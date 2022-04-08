package pomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMTest {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://kite.zerodha.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        
	        POMKiteLoginPage login=new POMKiteLoginPage(driver);
	        login.sendUserId();
	        login.sendPass();
	        login.clickLoginButton();
	        Thread.sleep(2000);
	        
	        POMPinPage pinPage=new POMPinPage(driver);
	        pinPage.SendPin();
	        pinPage.clickContinueButton();
	        Thread.sleep(2000);
	        
	        POMHomePage homePage=new POMHomePage(driver);
	        homePage.ValidateUserId();
	        homePage.clickOnLogout();
	        Thread.sleep(2000);
	        
	        driver.close();
 

	}

}
