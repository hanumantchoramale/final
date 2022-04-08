package array;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		
		char grade[]=new char[5];
		
		grade[0]='a';
		grade[1]='c';
		grade[2]='e';
		grade[3]='b';
		grade[4]='d';
		
//		for(int i=0;i<=4;i++) //static condition
//		{
//			System.out.println(grade[i]);
//		}
		
		for(int i=0;i<=grade.length-1;i++) //dynamic condition
		{
			System.out.println(grade[i]);
		}
//sort
		Arrays.sort(grade);
		System.out.println("-----------After sorting------------------------");
		
		for(int i=0;i<=grade.length-1;i++)
		{
			System.out.println(grade[i]);
		}
		System.out.println("-----------descending ------------------------");
		
		for(int j=grade.length-1;j>=0;j--)
		{
			System.out.println(grade[j]);
		}
 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
