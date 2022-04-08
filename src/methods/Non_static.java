package methods;

public class Non_static {

	public static void main(String[] args) {
		//for non static regular method,we need to create object
		
		//create object-->Classname objectname=new Classname();
		Non_static nc=new Non_static();
		
		nc.test1();   //call non static method from same class--->object.method name();	
        nc.test2();
	}

	public void test1()     //non-static regular method
	{
		System.out.println("This is non static method");
		
	}
	public void test2()
	{
		test1();
		System.out.println("This is non static method1");
		
		
	}
	
	
	
}
