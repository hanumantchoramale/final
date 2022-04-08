package Programs;

public class Palindrome {

	public static void main(String[] args) {
		
		int a=12361;
		int b=a;
		int rev=0;
		
		while(a>0)
		{
			rev=a%10+rev*10;
			a=a/10;
		}
		System.out.println(rev);
		if(b==rev)
		{
			System.out.println("Palindrome Number");
		}
			else
			{
				System.out.println("Not Palindrome Number");
				}
			}

	}

