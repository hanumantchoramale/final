package control_statment;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args)
   	{
	Scanner sc=new Scanner(System.in);		
	int year=sc.nextInt();
	
	switch (year)
	{
	case 1:System.out.println("I am in 1st year student");
	break;
	case 2:System.out.println("I am in 2nd year student");
	break;
	case 3:System.out.println("I am in 3rd year student");
	break;
	case 4:System.out.println("I am in Final year student ");
	break;
	default:System.out.println("Enter value between 1-4");
    break;
	}
	
	}
}
