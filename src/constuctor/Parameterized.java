package constuctor;

public class Parameterized {
      
	int a;  //variable declaration in class 
	int b;  //global variable
	int c;
	
	public Parameterized()  //constructor without parameter
	{
		a=1231;
		b=1444;
		c=5434;
		System.out.println("This is zero parameter constructor");
	}
	public  Parameterized(int num1) //constructor with one parameter
	
	{
		a=num1;
		System.out.println("This is one parameter constructor");
		System.out.println("Value of a is "+a);
	}
	
	public Parameterized(int num1,int num2) //constructor with two parameter
	{
		a=num1;
		b=num2;
		System.out.println("This is two parameter constructor ");
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
	}
	public Parameterized(int num1,int num2,int num3) //constructor with three parameter
	{
		a=num1;
		b=num2;
		c=num3;
		System.out.println("This is three parameter constructor");
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
		System.out.println("Value of c is "+c);
	}
	
	public static void main(String[] args) {
	   
		Parameterized h1=new Parameterized();    //object create for zero parameter constructor
		h1.addition();
		Parameterized h2=new Parameterized(133); //object create for one parameter constructor
		h2.addition();
		Parameterized h3=new Parameterized(2332, 343);//object create for two parameter constructor
		h3.addition();
		Parameterized h4=new Parameterized(232, 2321, 353);//object create for three parameter constructor
		h4.addition();
	}
     public void addition()
     {
    	 int sum=a+b+c;
    	 System.out.println("Addition is "+sum);
    	 System.out.println("=============================");
     }
}
