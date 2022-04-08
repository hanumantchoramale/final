package practice;

public class StringReverse {

	public static void main(String[] args) {
	
		String a="My Name Is Hanumant";
		String s[]=a.split(" ");
		  
		String rev="";
		
		for(int i=s.length-1;i>=0;i--)
		{
			rev=rev+s[i]+" ";
		}
		System.out.println(rev);

	}

}
