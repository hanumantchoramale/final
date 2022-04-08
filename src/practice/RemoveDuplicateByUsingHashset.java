package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateByUsingHashset {

	public static void main(String[] args) {

		String s[]= {"H","A","A","N","U","N"};
	//	HashSet s1=new HashSet<>();
		LinkedHashSet s1=new LinkedHashSet();
		
		for(Object o:s)
		{
			s1.add(o);
		}
		System.out.println(s1);
	}

}
