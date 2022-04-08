package arrayPrograms;

import java.util.Arrays;


public class Equal {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,5,6};
		
		boolean s=Arrays.equals(a, b);
		if (s==true)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");
//Without using equal method
		boolean status=true;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
					status=true;
				else
					status=false;
			}		
		}
		else
		{
			status =false;
		}
			if(status==true)
		{
			System.out.println("Array are equal");
		}
		else
		{
			System.out.println("Array are not equal");	
		}
	}

}
