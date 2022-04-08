package pomWithTestNG;

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
	
	public String getActualUserId()
	{
		String actualText= userId.getText();
		return actualText;
	
	}
	
	public void clickOnLogout() throws InterruptedException
	{
		userId.click();
		Thread.sleep(200);
		logout.click();
	}
}
