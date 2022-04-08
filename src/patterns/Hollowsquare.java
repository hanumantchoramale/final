package patterns;

public class Hollowsquare {

	public static void main(String[] args) {
		
		int n=5;
	//Hollow square	
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1|| i==n||j==1||j==n)
				System.out.print(" *");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
System.out.println();
// H letter
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||j==n||i==n/2+1)
				System.out.print(" *");
				else
                  System.out.print("  ");
			}
			System.out.println();
		}
//hollow increasing triangle
System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1||i==n||j==i)
				System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
//hollow pyramid
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1||i==n)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j=2;j<=i;j++)
			{
				if(i==n||j==i)
				System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
 
}
