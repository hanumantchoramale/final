package constuctor;

public class Userdefine {

	public Userdefine(int a,int b)   //userdefine constructor with parameter
	{
		int c=a+b;
		System.out.println("Addition of variable a,b,c "+c);
		}
	public Userdefine(float p,float q)   //userdefine constructor with parameter
	{ 
	   float r=p/q;
	   System.out.println("percentage of variable p,q,r "+r);
	}
	
	
	
	public Userdefine() {
		System.out.println("Hanumant");
	}
	public static void main(String[] args) {
   
		Userdefine add=new Userdefine(122,263); //only create objet..no need to call method
		Userdefine per=new Userdefine(2236f, 23f);
		 
		Userdefine t1=new Userdefine(); //create object for nonstatic method call
		t1.test1();                     // call nonstatic method
	}
   
	public void test1()
	{
		System.out.println("This is nonstatic method");
		
	}
}
