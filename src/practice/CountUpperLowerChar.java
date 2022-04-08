package practice;

public class CountUpperLowerChar {

	public static void main(String[] args) {
	
//		String s="HanUmanT ChoRaMale";
//		int lower=0;
//		int upper=0;
//		for(int i=0;i<s.length();i++)
//		{
//			char ch = s.charAt(i);
//			if(ch>='a' && ch<='z')
//			//if(ch>=65 && ch<=90)	
//			{
//				lower++;
//			}
//			else
//			{
//				upper++;
//			}
//			
//		}
//		System.out.println("Lower case characters "+lower);
//		System.out.println("Upper case characters "+upper);
//		
		String s1="HaNumAnt22";
		int lower1=0;
		int upper1=0;
		int digit=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			if(Character.isUpperCase(ch))
			
			{
				upper1++;
			}
			else if(Character.isLowerCase(ch))
			{
				lower1++;
			}
			else if(Character.isDigit(ch))
			{
			    digit++;	
			}
			
		}
		System.out.println("UpperCase characters-->"+upper1);
		System.out.println("LowerCase characters-->"+lower1);
		System.out.println("Digits-->"+digit);
			
	}

}
