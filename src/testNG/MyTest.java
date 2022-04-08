package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void Test1() {
	  System.out.println("Hi--Starts TestNG Coding");
  }
  @Test
  public void Test2() {
	  System.out.println("Hi--Starts TestNG Coding");
	  Reporter.log("Hi--Starts TestNG Coding",true);//true use for print in console also
  }
  @Test
  public void Test3() {
	  System.out.println("Hi--Starts TestNG Coding");
  }
  @Test
  public void Test4() {
	  System.out.println("Hi--Starts TestNG Coding");
  }
  
  
}
