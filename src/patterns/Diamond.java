package patterns;

public class Diamond {

	public static void main(String[] args) {

		for(int i=-2;i<=10;i++)
		{
			for(int j=20;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
       for(int i=9;i>=1;i--) 
       {
    	   for(int j=20;j>=i;j--)
    	   {
    		   System.out.print(" ");
    	   }
    	   for(int k=1;k<=i;k++)
    	   {
    		  System.out.print("* "); 
    	   }
    	   System.out.println();
       }
	}

}
