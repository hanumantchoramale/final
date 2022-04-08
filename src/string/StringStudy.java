package string;

public class StringStudy {

	public static void main(String[] args) {
//create object without new keyword
		String a="Hanumant ";
		String a1="Velapur";
		String a2="Hanumant";
		System.out.println(a==a1);//== shows memory same
		System.out.println(a==a2);
		System.out.println(a1.equals(a2));
		System.out.println("--------------------------------");
		
//create object with new keyword
		String s=new String("Hanumant");
		String s1=new String("VELAPUR");
		String s2=new String("Hanumant");
		System.out.println(s==s2); //false-->memory different
		System.out.println(s.equals(s2));//true-->content same
		System.out.println("----------------------------------");

		a=a.concat("Dada ").concat("Choramale");
		System.out.println(a);
		System.out.println(s.length());
		System.out.println(a1.length());
		System.out.println(a.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(a.charAt(8));
		System.out.println(a2.contains(s2));
		System.out.println(s1.startsWith("S"));
		System.out.println(s.endsWith("nt"));
	//blank empty instruction	
		String h="";
		String h1=" ";
		System.out.println(h.isBlank());
		System.out.println(h1.isBlank());
		System.out.println(h1.isEmpty());
		System.out.println(h.isEmpty());
		//substring
		String g="SairamSairam";
		String f = g.substring(5);
		System.out.println(f);
		String i=g.substring(3, 6);
		System.out.println(i);
		
		//index of
		System.out.println(a.indexOf('m'));
    	System.out.println(a.lastIndexOf('m'));
//		System.out.println(g.indexOf("Sa"));
//		System.out.println(g.lastIndexOf("Sa"));
//		System.out.println(g.indexOf('m', 6));
//		
		//replace
    	System.out.println(g.replace("ram", "nath"));
		
		
		String z="Hanumant";
		System.out.println(z.charAt(7));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
