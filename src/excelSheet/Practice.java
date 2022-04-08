package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	 	WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));

		FileInputStream f=new FileInputStream("D:\\Selenium\\Practice.xlsx");
		Sheet MySheet = WorkbookFactory.create(f).getSheet("Sheet2");
		String un = MySheet.getRow(2).getCell(1).getStringCellValue();
		String pass = MySheet.getRow(3).getCell(2).getStringCellValue();
		userName.sendKeys(un);
		Thread.sleep(2000);
		password.sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@id,'u_0_c')]")).click();
		
		
		
	}

}
