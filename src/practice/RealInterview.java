package practice;

public class RealInterview {

	public static void main(String[] args) {
//1	
		String s="Hanumant";
		
		for(int i=0;i<s.length();i++)
		{ 
			for(int j=0 ;j<s.length()-i;j++)
			{
				System.out.print(s.charAt(j ));
			}
			
			System.out.println();
		}
System.out.println();
//2
		int n=1;
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print (n++ +" ");
			}
			System.out.println();
		}
	}

}
