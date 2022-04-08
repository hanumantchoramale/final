package practice;

public class ReverseNumber {

	public static void main(String[] args) {
	
		int a=234;
		int b=0;
		while (a>0)
		{
//			b=a%10;
//			a=a/10;
//			System.out.print(b);
			b=b*10+a%10;
			a=a/10;
		}
System.out.println(b);
	}

}
