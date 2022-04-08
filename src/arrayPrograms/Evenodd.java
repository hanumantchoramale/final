package arrayPrograms;

public class Evenodd {

	public static void main(String[] args) {
	
		int a[]= {1,4,3,6,5,7,2};
	// By using for loop
		System.out.println("Even numbers by using for loop");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			
				System.out.println(a[i]);
		}	
		System.out.println("Odd numbers");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			
				System.out.println(a[i]);
		}	
	//By using enhanced for loop
		System.out.println("Even Value by using enhanced for loop");
		for(int value:a)
		{
			if(value%2==0)
				System.out.println(value);
		}
		System.out.println("Odd Numbers");
		for(int value:a)
		{
			if(value%2!=0)
				System.out.println(value);
		}
		 
		
	}

}
