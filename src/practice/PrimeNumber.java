package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a=13;
        int count=0;
		if(a>1)
		{
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println("This is Prime number");
			}
			else
			{
				System.out.println("Not a Prime NUmber");
			}
			
		}
		else 
		{
			System.out.println("Not a Prime NUmber");
		}
      
		
	}

}
