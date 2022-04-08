package exceptionHandling;

public class Arithematic {

	public static void main(String[] args) {
	//generic class
		try {
			
		} catch (Exception e) {//it handle all types of exception
			
		}
		
//Arithematic	
		int a=10;
		int b=2;
		
	    try {
			int c=a/b;
			System.out.println(c);
		} 
		catch (ArithmeticException e) //specific class
		{
		System.out.println("Cannot divide by Zero");
		}
		finally {
			System.out.println("Finally block");
		}
		  System.out.println("Hii All");
//StringIndexOutOfBound
	    
	    String s="Sai";
	   try {
		 
		System.out.println(s.charAt(2));
	       }
	   catch (Exception e) 
	   {
		System.out.println("Please enter 0-2");
	   } 
		  System.out.println("Hii All");
//Null pointer exception
	   String s1=null;
	   
	  try {
		  char c = s1.charAt(1) ;
		   System.out.println(c);
		
	     }
	  catch (NullPointerException e) 
	  {
		  System.out.println("Can not perform action on null value");
    	} 
	  System.out.println("Hii All");
	  
	  
	   
	   
	   

	}

}
