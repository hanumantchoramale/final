package collection;

import java.util.HashSet;

public class HashsetStudy {

	public static void main(String[] args) {
	
		HashSet hs=new HashSet<>();
		hs.add("Hanumant");
		hs.add("Hanu");
		hs.add('a');
		hs.add("Hanu");
		hs.add(24);
		hs.add(null);
		hs.add(null);
		
		
	
	//	hs.remove('a');
		System.out.println(hs.remove('a'));
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		
		// we can't use for loop,bcz order of insertion is random
		//use for each loop,iterator
	}

}
