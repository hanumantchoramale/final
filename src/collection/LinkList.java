package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LinkList {

	public static void main(String[] args) {
	
		LinkedList ll=new LinkedList<>();
		ll.add("Hanumant");
		ll.add('B');
		ll.add(9);
		ll.add("Velocity");
		System.out.println(ll);
		ll.add(3,"Top");
		System.out.println(ll);
	    ll.remove(3);
	   
	    ll.add(2,null);
	    System.out.println(ll);
	    System.out.println(ll.size());
	    System.out.println( ll.contains('B'));
	    System.out.println(ll.get(0));
	    System.out.println(ll.isEmpty());
	    for(int i=0;i<=ll.size()-1;i++)
	    {
	    	System.out.println(ll.get(i));
	    }
	    for(Object o:ll)
	    {
	    	System.out.println(o);
	    }

	    Iterator it = ll.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	    ListIterator li = ll.listIterator();
	    while(li.hasNext())
	    {
	    	System.out.println(li.next());
	    }
	   
	}

}
