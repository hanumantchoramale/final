package control_statment;

public class Else_if {

	public static void main(String[] args) 
	{
		// If more than two conditions,then we use else_if statement
		//if any condition satisfied,then get o/p of that  if/else if statement ..
		//if any condition not satisfied,then get o/p of else statement
		
		float per=64.32f;
		if(per>=70)
		{
			System.out.println("Grade of student is A ");
		}
        else if (per>=60 & per<70) 
        {
			System.out.println("Grade of student is B ");
		}
        else if(per>=40 & per<60)
        {
        	System.out.println("Grade of student is C ");
        }
        else
        {
        	System.out.println("Result of student is Fail ");
        }
	}

}
