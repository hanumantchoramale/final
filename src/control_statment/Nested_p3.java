package control_statment;

import java.util.Scanner;

public class Nested_p3 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String user_name=sc.next();
		
		if (user_name.equalsIgnoreCase("Hanumant"))
		{
			System.out.println("Enter password");
			String pass=sc.next();
			if (pass.equalsIgnoreCase("Hanu@123"))
			{
				System.out.println("Enter captcha");
				int captcha=sc.nextInt();
				if (captcha==123)
				{
					System.out.println("Login successfully");
				}
				else
				{
					System.out.println("Inserted Captcha is wrong ");
				}
			}
			else
			{
				System.out.println("Password is wrong,please insert correct password");
			}
		}
		else
		{
			System.out.println("Username invalid");
		}
	}
}
