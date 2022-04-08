package practice;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter three numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a>=b && a>=c)
	{
		System.out.println("Greter no is "+a);
	}
	else if(b>=c&&b>=a)
	{
		System.out.println("Greter no is "+b);
	}
	else 
	{
		System.out.println("Greter no is "+c);
	}

	}

}
