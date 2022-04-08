package patterns;

public class Formats {

	public static void main(String[] args) {
//Square
		int n=8;
		for(int i=1;i<=n;i++) //for rows
		{
			for(int j=1;j<=n;j++) //for column
			{
				System.out.print(" *");
			}
			System.out.println();
		}
//increasing triangle
		System.out.println("-------------------------");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
//decreasing triangle
		System.out.println("-----------------------------");
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
//right sided increasing triangle(decreasing+increasing)
		System.out.println("-----------------------------------");
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  "); 
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* "); 
			}		
			System.out.println();	
		}
//right sided decreasing triangle
		System.out.println("-----------------------------");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
//Hill/Pyramid	
		System.out.println("-------------------------------------");
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
