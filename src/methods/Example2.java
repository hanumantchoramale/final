package methods;

public class Example2 {

	public static void main(String[] args)
	{
		
       Example2 eg=new Example2(); //object create for nonstatic method
       eg.method();  //call method--->it is need for default constructor
	   
	}

     public void method()
    {
	int a=5;
	System.out.println("  "+a);

     }
   public Example2()  //userdefine constructor-->already create this class object..so no need to create object for this
                      
    {
      System.out.println(" This is userdefine constructor method");	

     }
}
