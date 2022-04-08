package control_statment;

public class If_IfElse {

	public static void main(String[] args) 
	{
		// if condition
		
		int atm_pin=1234;
		if(atm_pin==1234)  //true then display output which are in the body 
		                   //False then does not display o/p which are in the body
		{
			System.out.println("ATM Pin is correct,Enter amount ");
		}
		
		// if else condition
		//when condition is true -if condition o/p display
		//                  false-else condition o/p display 
		
		int marks= 20;
		if(marks>=40)
		{
			System.out.println("Result of Hanuamnt is Pass ");
		}
		else
		{
			System.out.println("Result of Hanuamnt is Fail");
		}
		
	}

}
