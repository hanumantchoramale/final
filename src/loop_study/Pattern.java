package loop_study;

public class Pattern {

	public static void main(String[] args) 
	{
	/*	for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)                standard for all pattern
			{
				System.out.print("*");	
			}
			System.out.println();
		}  */

		for(int i=1,p=2;i<=9;i++,p++)  //add p value for starting value, then p++
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(p+" ");	
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int j=1,p=12;j<=9;j++,p-=2)
		{
			for(int k=1;k<=j;k++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
	
	}

}
