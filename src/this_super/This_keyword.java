package this_super;

public class This_keyword extends Super_class
{
	int a=10;
	static int b=20;

	public static void main(String[] args) {
		
		This_keyword tk=new This_keyword();
		tk.test1();
		

	}
	public void test1()
	{
	    int a=2;
		int sum=4+a;
		int sum1=4+this.a;
		int add=10+super.a;
		System.out.println("Addition with local variable "+sum);
		System.out.println("Addition with global variable by using this "+sum1);
		System.out.println("Add with global variable of super class use super "+add);
		
	}
	public static void test2()
	{
		int b=5;
		int sub1=50-b;
	//	int add=100+super.b;
	//	int sub2=50-this.b; //in static,one variable store one into/data at a time
      
		
	
	}

}
