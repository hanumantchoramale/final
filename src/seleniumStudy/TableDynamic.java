package seleniumStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDynamic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000); 
		
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='product']//tr[1]//th"));
		int totalNumberOfColumn = headers.size();
		System.out.println(totalNumberOfColumn);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		int totalNumberOfRows = rows.size();
		System.out.println(totalNumberOfRows);
		
		for(int i=1;i<=totalNumberOfRows;i++)
		{
			String text;
			for(int j=1;j<=totalNumberOfColumn;j++)
			{
				if(i==1)
				{
					text=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(text+" ");
				}
				else
				{
					text=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(text+" ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		

	}

}
