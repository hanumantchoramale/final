package pomStudy1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	@FindBy(xpath = "//span[@class='user-id']") private WebElement userId;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logout;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ValidateUserId(String exp)
	{
		String actualText= userId.getText();
		String expectedtext = exp;
		if(actualText.equals(expectedtext))
		{
			System.out.println("Text matches TC Pass");
		}
		else
		{
			System.out.println("Text not Matches TC Failed");
		}
		
	}
	
	public void clickOnLogout() throws InterruptedException
	{
		userId.click();
		Thread.sleep(200);
		logout.click();
	}
}
