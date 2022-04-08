package arrayPrograms;

public class Practice {

	public static void main(String[] args) {
		int a[]= {2,2,6,2,3};
		
		for(int i=0;i<a.length;i++)
		{int count=0;
			for(int j=i+1;j<a.length;j++)
			{	
				if(a[i]==a[j])
			     count++;
			
	        }
			System.out.println(count);
		}
}
}
