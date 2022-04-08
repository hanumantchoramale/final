package collection;

import java.util.TreeSet;

public class TreesetStudy {

	public static void main(String[] args) {
	
		TreeSet t=new TreeSet<>();
		t.add("Hanumant");
		t.add("Hanu");
		t.add("dada");
		t.add("Sai");
		t.add("Hanu");
		t.add("Choramale");
		System.out.println(t);
		System.out.println(t.pollFirst());//retrive and remove first
		System.out.println(t.pollLast());//retrive and remove last
		System.out.println(t.remove("Hanu"));//remove and get return boolean value
		System.out.println(t);
		

	}

}
