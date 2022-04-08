package arrayPrograms;

public class Duplicate {

	public static void main(String[] args) {
		
		int a[]= {2,4,6,4,2,4};
		int count=0;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					//count=count+1;
			System.out.println("Found duplicate values "+a[j]);
		
				flag=true;  
				 break;
				}	
			} 
		}
		if(flag==false)
		{
			System.out.println("No any duplicate value");
		}
		

	}

}
