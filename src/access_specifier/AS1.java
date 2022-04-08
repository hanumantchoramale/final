package access_specifier;

public class AS1 {
	
	
      int a=10;
	public int b=20;
	protected int c=30;
	private int d=40;
	
	public static void main(String[] args) {
	
		AS1 as=new AS1();
		as.test1();
		as.test2();
		as.test3();
		as.test4();
		System.out.println("\n");
		System.out.println("default variable a is "+as.a);
		System.out.println("public variable b is "+as.b);
		System.out.println("protected variable c is "+as.c);
		System.out.println("private variable d is "+as.d);
		
		 

	}
	
	public void test1()
	{
		System.out.println("Public method of AS1 class");
	}
	
	void test2()
	{
		System.out.println("Default method of AS1 class");
	}
	
	protected void test3()
	{
		System.out.println("protected method of AS1 class");
	}
	
	private void test4()
	{
		System.out.println("private method of AS1 class");
	}

}
