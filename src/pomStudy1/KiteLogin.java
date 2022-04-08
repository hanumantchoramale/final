package pomStudy1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin {
	//VAriable Declaration-->WebElement
	
		@FindBy(id="userid") private WebElement userIdField;
		@FindBy(id="password")private WebElement passField;
		@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
		
		//use constructor--public
		
		public KiteLogin(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//Methods which works on data members
		
		public void sendUserId(String userid)
		{
			userIdField.sendKeys(userid);
		}
		
		public void sendPass(String pass)
		{
			passField.sendKeys(pass);
		}
		
		public void clickLoginButton()
		{
			loginButton.click();
		}
		
	}

