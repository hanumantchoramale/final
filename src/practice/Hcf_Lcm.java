package practice;

import java.util.Scanner;

public class Hcf_Lcm {

	public static void main(String[] args) {
		//find common factors
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter any two number");
		//int a=sc.nextInt();
		//int b=sc.nextInt();
		int a=50;
		int b=60;
		System.out.println("Common factors are ");
		for(int i=1;i<=a;i++)
		{
				if(a%i==0 && b%i==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("=============================");
		//find HCf
		int g=0;
		for(int i=1;i<=a;i++)
		{
				if(a%i==0 && b%i==0) 
				g=i;
	    }
				
				System.out.println("HCF is "+g);
				System.out.println("======================");
				
				//find LCM
			
				int lcm=a*b/g;
				System.out.println("LCM is "+lcm);
		}
	}


