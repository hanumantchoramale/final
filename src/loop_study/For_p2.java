package loop_study;

public class For_p2 {

	public static void main(String[] args)
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(" "+i);
			
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int a=9;a>=1;a--)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(" "+a);
			}
			System.out.println();
		}
	

	}

}
