package pomWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePin {
	@FindBy(id="pin") private WebElement pinField;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;
	
	public KitePin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void SendPin(String pin)
	{
		pinField.sendKeys(pin);
	}
	
	public void clickContinueButton()
	{
		continueButton.click();
	}
}
