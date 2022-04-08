package control_statment;

public class Nested_p1 {

	public static void main(String[] args)
	{
		String user_name="Hanumant";
		String pass="Hc@123";
		int captcha=1234;
		
		if (user_name=="Hanumant")
		{
			System.out.println("Enter Your Password");
			if (pass=="Hc@123")
			{
				System.out.println("Please enter Captcha");
				
				if (captcha==1234)
				{
					System.out.println("Login Successfully");
				}
				else
				{
					System.out.println("please Enter Correct Captcha");
				}
			}
			else
			{
				System.out.println("Password is Incorrect");
			}
			
		
		}
		else
		{
			System.out.println("Username is incorrect");
		}
		
		

	}

}
