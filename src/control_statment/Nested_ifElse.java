package control_statment;

public class Nested_ifElse {

	public static void main(String[] args)
	{
		//if username is correct,then please enter password,if password is correct then "login successful" welcome
		//if password is incorrect then please check your password,else incorrect username
		
		String user_name="Hanumant";
		String pass="Hanu@123";
		
		if (user_name=="Hanumant")
		{
			System.out.println("Please enter Password");
			if (pass=="Hanu@123")
			{
				System.out.println("Login Successful");
			}
			else
			{
				System.out.println("Invalid Password");
			}
		}
		
		else
		{
			System.out.println("Please enter valid Username");
		}
	

	}

}
