package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashmapStudy {

	public static void main(String[] args) {
	
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		hm.put(1, "Hanumant");
		hm.put(2, "Sagar");
		hm.put(null,"sai");
		hm.put(3,"sai");
		System.out.println(hm.get(4));
		hm.remove(2);
		for(Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println(hm);
		System.out.println(hm.get(2));


	}

}
