package arrayPrograms;

public class Missing {

	public static void main(String[] args) {
	//no duplication 
		// values in range

		int a[]= {1,2,3,4,6};
		int b=0;
		for(int i=0;i<a.length;i++) 
		{
			b=b+a[i];
		}
		System.out.println(b);
		
		int c=0;
		for(int i=1;i<=6;i++)
		{
			c=c+i;
		}
		System.out.println(c);
		
		int d=c-b;
		System.out.println("missing number is "+d);
	}

}
