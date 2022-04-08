package practice;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		//System.out.println("Enter any value");
		//Scanner sc=new Scanner(System.in);
	   // int n=sc.nextInt();
		int n=423;
	    if (n%2==0) {
	    	System.out.println("This is Even Number");
	    }
	    else {
	    	System.out.println("This is Odd number");
	    }
System.out.println("====================================");
      int b=0;
      int a=10;
       System.out.println("Print even numbers from 1 to "+a);
	    for(int i=1;i<=a;i++)
	    {
	    	if(i%2==0)
	    		b=b+i;    	
	    }
	    System.out.println(b);
	    
	}

}
