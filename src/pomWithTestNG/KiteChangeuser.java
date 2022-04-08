package pomWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteChangeuser {

	@FindBy(linkText = "Change user") private WebElement changeUser;
	
	public KiteChangeuser(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnChangeUser()
	{
		changeUser.click();
	}
}
