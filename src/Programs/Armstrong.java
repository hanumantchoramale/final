package Programs;

public class Armstrong {

	public static void main(String[] args) {
	
		int a=153;
		int b=a;
		int d=0;
		
		while(a>0)
		{
			int c=a%10;
			d=(c*c*c)+d;
			a=a/10;	
		}
       
		if(b==d)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
	}

}
