package seleniumStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='product']//th"));
        System.out.println(headers.size());
        
//        for(int i=0;i<=3;i++)
//        {
//        	System.out.println(headers.get(i).getText());
//        }
		
        for(WebElement w:headers)
        {
        	System.out.print(w.getText()+" ");
        }
        for(int i=1;i<=11;i++)
        {
        System.out.println();
        List<WebElement> firstRow = driver.findElements(By.xpath("//table[@id='product']//tr["+i+"]//td"));
        for(WebElement w:firstRow)
        {
        	System.out.print(w.getText()+" ");
        }
        }
	}

}
