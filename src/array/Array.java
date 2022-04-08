package array;

public class Array {

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
    	 count=count+i;
     }
     System.out.println(count);
	}

}
