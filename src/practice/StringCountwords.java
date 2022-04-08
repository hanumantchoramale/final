package practice;

public class StringCountwords {

	public static void main(String[] args) {
		 
		String s="I Am Hanumant Choramale";
	//	int count=1;
//		for(int i=0;i<=s.length()-1;i++)
//		{
//			if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' '))
//			
//				count++;
//			
//			
//		}
//		System.out.println("Number of words in string "+count);

		
		String s1="My name is Hanumant dada Choramale";
		int s2=s1.split(" ").length;
		System.out.println(s2);
	}

}
