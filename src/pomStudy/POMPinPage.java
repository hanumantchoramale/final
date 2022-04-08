package pomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMPinPage {

	@FindBy(id="pin") private WebElement pinField;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;
	
	public POMPinPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void SendPin()
	{
		pinField.sendKeys("866918");
	}
	
	public void clickContinueButton()
	{
		continueButton.click();
	}
}
