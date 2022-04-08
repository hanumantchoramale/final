package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil 
{
	static JavascriptExecutor js;
	public static void changeColour(String colour,WebDriver driver,WebElement element)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor='"+colour+"'", element);
		
	}
	
	public static void flash(WebDriver driver,WebElement element)
	{
		String bgColour = element.getCssValue("backgroundColor");
		for(int i=0;i<=500;i++)
		{
		changeColour("#000000", driver, element);
		changeColour(bgColour, driver, element);
		}
	}
	public static void border(WebDriver driver,WebElement element)
	{
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	public static String getTitleByJS(WebDriver driver)
	{
		String title = js.executeScript("return document.title;").toString();
	    return title;
	}
	
	
	
	
	
	
}
