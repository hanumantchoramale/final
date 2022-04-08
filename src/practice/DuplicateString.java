package practice;

public class DuplicateString {

	public static void main(String[] args) {
		
		String s="maheshbabu";
	char ch[]=s.toCharArray();
	int count=0;
	System.out.println("Duplicate Characters");
	
		for(int i=0;i<ch.length;i++)
		{
			for(int j= i+1;j<ch.length ;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]);
					count++;
					break;

				}
			}		
		}
		System.out.println("Total Duplicate Characters "+count);
	}
}
		

	


