package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchMultipleBrowser {
  @Test
  public void Test1() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

      WebDriver driver=new ChromeDriver();
      driver.get("https://vctcpune.com/selenium/practice.html");
      driver.manage().window().maximize();
  }
  @Test
  public void Test2() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

      WebDriver driver=new ChromeDriver();
      driver.get("https://www.google.co.in/");
      driver.manage().window().maximize();
  }
  @Test
  public void Test3() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();
  }
  @Test
  public void Test4() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

      WebDriver driver=new ChromeDriver();
      driver.get("https://skpatro.github.io/demo/links/");
      driver.manage().window().maximize();
  }
}
