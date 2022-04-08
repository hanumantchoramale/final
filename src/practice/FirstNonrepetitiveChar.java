package practice;

import java.util.HashMap;

public class FirstNonrepetitiveChar {

	public static void main(String[] args) {
		String s="aabbccddeeff";
		HashMap<Character ,Integer> hm=new HashMap<Character,Integer>();
		int length = s.length();	
		for(int i=0;i<length;i++)
		{
			 char currentChar = s.charAt(i);
			if(hm.containsKey(currentChar)==false)
				hm.put(currentChar, 1);
			else
			{
				Integer currentFre = hm.get(currentChar);
				currentFre++;
				hm.put(currentChar, currentFre);
			}		  
		}
		for(int i=0;i<length;i++)
		{
			char currentChar = s.charAt(i);
			Integer currentFreq = hm.get(currentChar);
			if(currentFreq==1)
			{
				System.out.println("First non-repetative char "+currentChar);
				break;
			}
			else
			{
				System.out.println("All characters are repeted");
				break;
			}
		}

	}

}
