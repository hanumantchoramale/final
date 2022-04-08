package arrayPrograms;

public class Search {

	public static void main(String[] args) {
		
		int s[]= {20,34,46,34,50};
		int search=34;
		boolean flag=false;
		
		for(int i=0;i<s.length;i++)
		{
			if(search==s[i])
			{
				System.out.println("Element found "+search);
				flag=true;
			    break;
			}
		}

		if(flag==false)
		{
			System.out.println("Element not found");
		}
	}

}
