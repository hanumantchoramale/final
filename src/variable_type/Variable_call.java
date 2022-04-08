package variable_type;

public class Variable_call {
	static int f=55;
	int a=123;
	static int b=234;
	String name;

	public static void main(String[] args)
	{
	
	 int c=34; //local variable
	 int sum = c+b;
	 System.out.println("Addition of main method is "+sum);
	 Variable_call vc1=new Variable_call();
	 int sub=b-vc1.a;
	 System.out.println("Substraction of main method is "+sub);
	 test1();  //call static method
	 vc1.test2();  //call non-static method
	
	}
	
    public static void test1()
    {
    	int d=23;
    	
    	// int sum=d+a; we can't call non-static variable in static method
    		int sum=d+b;
    	System.out.println("Sum of ststic method is "+sum);
    }
    
    public void test2()
    {
    	int f=11;
    	 int c=122;
    	int sum=a+b;   //we call any type of variable in non_static method
    	System.out.println("Sum of nonstatic method is "+sum);
    	System.out.println(f);
    	System.out.println(this.f);
    	int sum1=100+this.f;
    	System.out.println(sum1);
    	
    }
}
