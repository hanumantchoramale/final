package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteWithDDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("D:\\Selenium\\Practice.xlsx");
		Sheet MySheet = WorkbookFactory.create(f).getSheet("Sheet4");
		String myUsername = MySheet.getRow(0).getCell(0).getStringCellValue();
		String myPassword = MySheet.getRow(0).getCell(1).getStringCellValue();
		String myPin = MySheet.getRow(0).getCell(2).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://kite.zerodha.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        WebElement userIdField = driver.findElement(By.id("userid"));
	        WebElement passFild = driver.findElement(By.id("password"));
	        userIdField.sendKeys(myUsername);
	        passFild.sendKeys(myPassword);
	        driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	        Thread.sleep(1000);
	        WebElement pinField = driver.findElement(By.id("pin"));
	        pinField.sendKeys(myPin);
	        driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	        Thread.sleep(1000);
	        WebElement accountName = driver.findElement(By.xpath("//span[@class='user-id']"));
	        String actualText = accountName.getText();
         String expectedText = myUsername;
         if(actualText.equals(expectedText))
         {
         	System.out.println("Text matches TC Pass");
         }
         else
         {
         	System.out.println("Text not matches TC Fail");
         }
         
          accountName.click();
          driver.findElement(By.xpath("//a[@target='_self']")).click();
          driver.close(); 

	}

}
