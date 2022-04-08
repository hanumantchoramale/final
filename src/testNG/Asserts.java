package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserts {
  @Test
  public void equal() 
  {
	  String s="Sai";
	  String s1="Sai";
	  Assert.assertEquals(s, s1,"Text not maching");//msg display when TC fail  
  }
  
//  @Test
//  public void notEquals()
//  {
//	  String s="Sai";
//	  String s1="Sai";
//	  Assert.assertNotEquals(s, s1,"Text are match");
//  }
	
//	@Test
//	public void True()
//	{
//		boolean result=false;
//		Assert.assertTrue(result,"Result is false");
//	}
	
//	@Test
//	public void False()
//	{
//		boolean result=true;
//		Assert.assertFalse(result,"Result is true");
//	}
	
//	@Test
//	public void Null()
//	{
//		String s=" ";   //null
//		Assert.assertNull(s,"s is not null");
//	}
	
//	@Test
//	public void NotNull()
//	{
//		String s=null;
//		Assert.assertNotNull(s,"s is null");
//	}
	
//	@Test
//	public void fail()
//	{
//		String s=null;
//		Assert.assertNull(s,"s is not null");
//		System.out.println("Before AssertFail");
//		Assert.fail();
//		System.out.println("After AssertFail");
//	}
}





