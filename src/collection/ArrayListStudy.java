package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudy {

	public static void main(String[] args) {
	
	ArrayList al=new ArrayList<>();
	al.add("Hanumant");
	al.add('B');
	al.add(9);
	al.add("Velocity");
	System.out.println(al);
	al.add(3,"Top");
	System.out.println(al);
    al.remove(3);
    al.add(2,null);
    System.out.println(al);
    al.set(1, 'c');
    System.out.println(al.size());
    System.out.println( al.contains('B'));
    System.out.println(al.get(0));
    System.out.println(al.isEmpty());
    System.out.println( al.indexOf('B'));
    System.out.println( al.lastIndexOf('B'));
    System.out.println("===By using For Loop=====");
    for(int i=0;i<=al.size()-1;i++)
    {
    	System.out.println(al.get(i));
    }
    System.out.println("===By using iterator Loop=====");
    
    Iterator it = al.iterator();
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }

    System.out.println("===By using For each Loop=====");
    for(Object o:al)
    {
    	System.out.println(o);
    }

	}

}
