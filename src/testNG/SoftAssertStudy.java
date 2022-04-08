package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
	SoftAssert sa=new SoftAssert();
  @Test
  public void Tc1() 
  {
	  String s="Sai";
	  String s1="Sai";
	  sa.assertEquals(s,s1,"Text not mathches");
	  sa.assertNull(s1,"S1 is notNull");
	  sa.assertNotEquals(s,s1,"Text matches");
	  sa.assertAll();
  }
@Test
  public void Tc2() 
  {
	  String s="Sai";
	  String s1="Sai";
	  sa.assertEquals(s,s1,"Text not mathches");
	  Assert.assertNull(s1,"S1 is notNull");
	  sa.assertNotEquals(s,s1,"Text matches");
	  sa.assertAll();
  }
  @Test
  public void Tc3() 
  {
	  String p="Sai";
	  String q="Sai";
	  sa.assertEquals(p,q,"Text not mathches");
	  sa.assertNull(p,"q is notNull");
	  sa.assertNotEquals(p,q,"Text matches");
	  sa.assertAll();
  }
}
