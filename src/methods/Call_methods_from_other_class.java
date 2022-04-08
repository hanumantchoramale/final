package methods;

public class Call_methods_from_other_class {

	public static void main(String[] args) {
	
		System.out.println("This is main method");
		
		//for static method calling
		
		test1();             //static regular method call from same class-->methodname();
		Example1.test1();    //call static reg. method from Example1 class-->classname.methodname();
		
		//for non static method calling
		
		//create object for that class e.g. Example2
      Example2 hc=new Example2();   //for create object-->classname objectname=new classname();
      hc.method();      //call non static method-->object.methodname();
      
	}
     
	public static void test1()
	{
		System.out.println("This is static regular method call from same class");	
	}

}
