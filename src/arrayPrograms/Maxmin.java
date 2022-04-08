package arrayPrograms;

public class Maxmin {

	public static void main(String[] args) {
	
		int a[]= {23,1,100,33,67,21,45};
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];  
		}
       System.out.println("Maximum number is "+max);
       
       int min=a[0];
       for(int i=0;i<a.length;i++)
       {    
    	   if(a[i]<min)
    		   min=a[i];
       }
       System.out.println("Minimum number is "+min);
	}

}
