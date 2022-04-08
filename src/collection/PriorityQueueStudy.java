package collection;

import java.util.PriorityQueue;

public class PriorityQueueStudy {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue<>();
		p.add("Hanumant");
		p.add("Choramale");
	//	p.add(123);
		//p.add(null);
		//p.add(123);
		p.add("Samir");
		p.add("Amar");
		p.add("Sagar");
		System.out.println(p);
		System.out.println(p.peek());//Retrives but nt remove 1st
		System.out.println(p);
		System.out.println(p.poll());//Retrives & remove 1st
		System.out.println(p);
		System.out.println(p.comparator());
		System.out.println(p.remove());//work same as poll,que empty>NoSuchElementException
		System.out.println(p);

	}

}
