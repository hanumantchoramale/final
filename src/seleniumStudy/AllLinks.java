package seleniumStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
  //links      
       List<WebElement> Links = driver.findElements(By.tagName("a"));
       int Total = Links.size();
       System.out.println("Total number of Links "+Total);
       
//       for(int i=0;i<Links.size();i++)
//       {
//    	   System.out.println(Links.get(i).getAttribute("href"));
//    	   System.out.println(Links.get(i).getText());
//       }
//       
       for(WebElement w:Links)
       {
    	   System.out.println(w.getText());
    	   System.out.println(w.getAttribute("href"));
       }
  //web elements
       List<WebElement> elements = driver.findElements(By.xpath("//*"));
      int size = elements.size();
//      System.out.println(size);
//      
//      for(int i=0;i<size;i++)
//      {
//    	  System.out.println(elements.get(i).getTagName());
//    	  System.out.println(elements.get(i).getText());  
//    	  
//    	  
//      }
      
	}

}
