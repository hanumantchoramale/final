package arrayPrograms;

public class Duplicateword {

	public static void main(String[] args) {
		 String s[]= {"Java","C++","Java","C","C++"};
		 System.out.println("Duplicate words ");
		 for(int i=0;i<s.length;i++)
		 {
			 for(int j=i+1;j<s.length;j++)
			 {
				// if(s[i].equals(s[j]))
					 if(s[i]==s[j])
				 {
					 System.out.println(s[i]);
				 }
			 }
		 }
//			int a[]= {2,4,6,4,2,4};
//		
//			for(int i=0;i<a.length;i++)
//			{
//				for(int j=i+1;j<a.length;j++)
//				{
//					 if(a[i]==a[j]);
//					
//					{
//					System.out.println (a[i]);
//					
//					
//					}	
//				} 
//			}
//			
//			

	}

}
