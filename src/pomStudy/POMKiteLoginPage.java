package pomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMKiteLoginPage {

	//VAriable Declaration-->WebElement
	
	@FindBy(id="userid") private WebElement userIdField;
	@FindBy(id="password")private WebElement passField;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	//use constructor--public
	
	public POMKiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods which works on data members
	
	public void sendUserId()
	{
		userIdField.sendKeys("DAA677");
	}
	
	public void sendPass()
	{
		passField.sendKeys("Velocity@123");
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
}
