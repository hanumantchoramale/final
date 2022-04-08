package access_specifier;

public class AS2 {

	public static void main(String[] args) {
		
		AS1 as=new AS1();
		as.test1();
		as.test2();
		as.test3();
	//	as.test4(); //scope of private AS is only within class,we can't call another class

		System.out.println("\n");
		System.out.println("AS1 public variable "+as.b);
		System.out.println("AS1 default variable "+as.a);
		System.out.println("AS1 protected variable "+as.c);
	//	System.out.println("Private variable "+as.d); //we can't call private variable in another class
		
	}

}
