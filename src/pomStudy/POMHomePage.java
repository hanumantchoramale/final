package pomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMHomePage {

	@FindBy(xpath = "//span[@class='user-id']") private WebElement userId;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logout;
	
	public POMHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ValidateUserId()
	{
		 
	}
	
	public void clickOnLogout() throws InterruptedException
	{
		userId.click();
		Thread.sleep(200);
		logout.click();
	}
}
