 package collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableStudy {

	public static void main(String[] args) {

		Hashtable h1=new Hashtable();
		h1.put(1,"Hanumant");
		h1.put(2,"Choramale");
		h1.put(3, "Sai");
		System.out.println(h1);
		//copy
		Hashtable h2=new Hashtable();
		h2=(Hashtable)h1.clone();
		System.out.println(h1);
		System.out.println(h2);
		
		h1.clear();
		System.out.println(h1);
		System.out.println(h2); //h2 not clear bcz its duplicate values
		
		Hashtable st=new Hashtable();
		st.put(1,"Hanumant");
		st.put(2,"Choramale");
		st.put(3, "Sai");
	//	st.put(5,null);     null pointer exception
		System.out.println(st);
		
		if(st.contains("Sai"))
			System.out.println("value is found");
		
		Enumeration e = st.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		} 
		
	    Set s = st.entrySet();	
	    System.out.println(s );
	    System.out.println(h1.equals(st));
	    System.out.println(st.hashCode());
		
		

	}

}
