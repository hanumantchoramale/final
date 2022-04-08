package practice;

public class Armstrong {

	public static void main(String[] args) {
		int b=0;
		int a=153;
	
		int d=a;
		while(a>0)
		{
			int c=a%10;
			 b=(c*c*c)+b;
			 a=a/10;
		}
		if(d==b)
		{
			System.out.println("It is armstrong number");
		}
		else
		{
			System.out.println("It is not a armstrong number");
		}
		
		
	}

}
