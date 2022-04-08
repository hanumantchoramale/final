package control_statment;

import java.util.Scanner;

public class Nested_p2 {

	public static void main(String[] args) 
	{
		//Find large number out of three numbers
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of a");
		int a=sc.nextInt();
		System.out.println("Enter number of b");
		int b=sc.nextInt();
		System.out.println("Enter number of c");
		int c=sc.nextInt();
		
		if (a>=b)
		{
			if (a==b)
			{
				if (b==c)
				{
					System.out.println("value of a,b,c are equal");
				}
				else
				{
					if (b>c) 
					{
						System.out.println("Value of a and b are equal");
					}
					else
					{
						System.out.println("Value of c is large");
					}
				}
			}
			else 
			{
			if (a>=c)
			{
				if(a==c)
				{
					System.out.println("Value of a and c are equal");
				}
				else
				{
					System.out.println(" Value of a is large");
				}	
			}
			else 
			{
				System.out.println("Value of c is larege");
			}
			}	
		}
		else
		{
			if (b>=c)
			{
			  if (b==c)
			  {
				  System.out.println("Value of b and c are equal");
			  }
			  else
			  {
				  System.out.println("Value of b is large");
			  }
			}
			else
			{
				System.out.println("Value of c is large");
			}
		}
	}

}
