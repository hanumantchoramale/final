package constuctor;

public class Variable_call {

	int a=10;
	static int b=26;
	String name="Hanumant";
	
	public static void main(String[] args) {
	
    Variable_call vc=new Variable_call();
    System.out.println(vc.a);  //variable call from same class
    System.out.println("value of variable b is "+b);
    System.out.println("value of variable name is "+vc.name);
    
    Example1 eg=new Example1();
    System.out.println("variable call from another class "+eg.c);//variable call from another class
	}

}
