package input_output;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		float a,b,c;
		System.out.println("Enter two value");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st value");
		a=sc.nextFloat();
		System.out.println("Enter 2nd value");
		b=sc.nextFloat();
		c=a+b;
		System.out.println("Addition is "+c);
		

	}
}
