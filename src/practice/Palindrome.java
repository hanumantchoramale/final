package practice;

public class Palindrome {

	public static void main(String[] args) {
		
		int a=1232;
		int b=a;
		int rev=0;
	
 while(a>0)
 {
	 rev=rev*10+a%10;
	 a=a/10;	 
 }
 System.out.println("Reverse number "+rev);
       
     if(b==rev)
     {
    	 System.out.println(b+" is a palidrome number");
     }
     else
     {
    	 System.out.println(b+" is not a palidrome number");     }
 
	}

}
