package Programs;

public class Reversestring {

	public static void main(String[] args) {
		
		String s="Hanumant";
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
 
		System.out.println(rev);
		
		String h="Hanumant Dada Choramale";
		String s1[]=h.split(" ");
		String rev1="";
		for(int i=s1.length-1;i>=0;i--)
		{
			rev1=rev1+s1[i]+" ";
		}
	System.out.println(rev1);	
	}

}
