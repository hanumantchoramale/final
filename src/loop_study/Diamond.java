package loop_study;

public class Diamond {

	public static void main(String[] args)
	{
		System.out.println("-----------------------------------");
		System.out.println("Table of 1 to 100 \n");
		
		for(int i=1;i<=10;i++)
		
		{
			for(int j=0;j<=9;j++) 
			{
			System.out.print(" "+(i+j*10));
			}
			System.out.println();
		}
		System.out.println("======================================");

		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+i);
				
			}
			System.out.println();
		}
	}

}
