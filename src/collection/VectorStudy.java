package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		
		Vector v=new Vector<>();
		v.add("Hanumant");
		v.add('B');
		v.add(9);
		v.add("Velocity");
		System.out.println(v);
		v.add(3,"Top");
		System.out.println(v);
	    v.remove(3);
	    v.add(2,null);
	   System.out.println( v.capacity());//not in arraylist
	   v.set(1, 'c');
	    System.out.println(v);
	    System.out.println(v.size());
	    System.out.println( v.contains('B'));
	    System.out.println(v.get(0));
	    System.out.println(v.isEmpty());
	    System.out.println( v.indexOf("Hanumant"));
	    System.out.println( v.lastIndexOf("Hanumant"));
	    for(int i=0;i<=v.size()-1;i++)
	    {
	    	System.out.println(v.get(i));
	    }
	    
	    Iterator it = v.iterator();
	    
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	    
	    Enumeration e = v.elements();
	    
	    while(e.hasMoreElements())
	    {
	    	System.out.println(e.nextElement());
	    }

	}

}
