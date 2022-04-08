package practice;

public class CharcountinString {

	public static void main(String[] args) {
		
		String s="My Name Is Hanumant";
		int a=s.length(); //total length
		String b=s.replace("a","");
		int c=b.length();// length after removing a
		int count=a-c;
		System.out.println("Occurance of a is "+count+" times");

	}

}
  