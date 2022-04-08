package practice;

public class DigitCounting {

	public static void main(String[] args) {
	
		int count=0;
		long a=25334;
		while(a>0)
		{
		     a=a/10;
			count=count+1;
		}
		System.out.println("Total digits in given number\n ");
        System.out.println(count);
	}

}
