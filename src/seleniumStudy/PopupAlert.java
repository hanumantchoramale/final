package seleniumStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);
        Alert alertPopup = driver.switchTo().alert();
        System.out.println(alertPopup.getText());
        Thread.sleep(2000);
        alertPopup.accept();
      //  alertPopup.dismiss();
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(6000);
        Alert alertPopup1 = driver.switchTo().alert();
        alertPopup1.accept();
        


	}

}
