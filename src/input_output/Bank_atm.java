package input_output;

import java.util.Scanner;

public class Bank_atm {

	public static void main(String[] args) {
	
		System.out.println("Enter your Account ");
		Scanner sc=new Scanner(System.in);
		long acc_no=sc.nextLong();
		if( acc_no<=9999999999999999l );
		{System.out.println("Account is verfied");}
		
		System.out.println("Enter IFSC code");
		String ifsc_code=sc.next();
		System.out.println("Please select following options");
		System.out.println("Type 1 for Balance check");
		System.out.println("Type 2 for Money transfer");
		int a=sc.nextInt();
	    int balance=50000;
	    if (a==1)
	    {
	    	System.out.println("Your account balance ia "+ balance);
	    	}
	  
	    if (a==2)
	    {
	    	System.out.println("Please enter Beneficiary account number");
	    	}
	    long cust_acc_no=sc.nextLong();
	    if(cust_acc_no<=9999999999999999l);
	    {System.out.println("Please enter amount to be transfered");}
	    int c=sc.nextInt();
	    System.out.println("Transaction Succeccfull");
	    int rem_bal=balance-c;
	    System.out.println("Remaining balance "+rem_bal);
	    System.out.println("Thank You");
	    
	    
	    
	   
	    
			
		
		

	}

}
