package arrayPrograms;

public class SumReverse {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,1,2,1,3,4,2};
		//Reverse
			for(int i=a.length-1;i>=0;i--)
			{
				System.out.print(a[i]+",");
			}
			System.out.println();
			
	//sum	
			int count=0;
		     for(int i=0;i<a.length;i++)
		     {
		    	 count=count+a[i];
		     }
		     System.out.println("Sum by using for loop "+count);
			
	// sum by using enhanced for loop
	
	int sum=0;
	for(int value:a)
	{
		sum=sum+value;
	}
    System.out.println("Sum by using enhanced for loop "+sum);
	}
}

