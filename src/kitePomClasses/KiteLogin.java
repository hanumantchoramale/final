package kitePomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin
{
	@FindBy(id="userid") private WebElement userId;
	@FindBy(id="password") private WebElement pass;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	@FindBy(xpath="//span[contains(text(),'Password should be minimum ')]")private WebElement passErrorMsg;
	@FindBy(xpath="//span[contains(text(),'User ID should be minimum')]")private WebElement userErrorMsg; 
	
	public KiteLogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	
	}
	
	public void sendUserId(String userName)
	{
		userId.sendKeys(userName);
	}
	public void sendPass(String password)
	{
		pass.sendKeys(password);
	}

	public void clickOnLogin()
	{
		loginButton.click();
	}
	public String getuserErrorMsg()
	{
		String errorMsg = userErrorMsg.getText();
		return errorMsg;	
	}
	public String getpassErrorMsg()
	{
		String errorMsg = passErrorMsg.getText();
		return errorMsg;	
	}
}
