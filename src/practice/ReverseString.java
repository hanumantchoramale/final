package practice;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="Hanumant";
		String s1="";
		int a=s.length();
		
		for(int i=a-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);

	}

}
  