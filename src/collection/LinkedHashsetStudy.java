package collection;

import java.util.LinkedHashSet;

public class LinkedHashsetStudy {

	public static void main(String[] args) {
	
		LinkedHashSet hs=new LinkedHashSet<>();
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

	}

}
