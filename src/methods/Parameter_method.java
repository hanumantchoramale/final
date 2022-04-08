package methods;

public class Parameter_method {
	
	
	public static void demo(String name,String add,long mob_no,float per,char grade)
	{
		System.out.println("==================================");
		System.out.println("Student name is "+name);
		System.out.println("Student address are "+add);
		System.out.println("Student mob number is "+mob_no);
		System.out.println("Student percentage is "+per);
		System.out.println("Steudent grade is "+grade);
		System.out.println("------------------------------------");
		
		
		
	}
	

	public static void main(String[] args) {
		//create object
		Parameter_method pm=new Parameter_method();
		
		pm.addition(188,232,232);//call nonstatic method from same class
		
		//call static method with parameter from same class
		demo("Hanumant choramale", "a/p-Velapur,Tal-malshiras,Dist-solapur", 9561238149l, 66.4f, 'A');
		
	

	}

	public void addition(int a,int b,int c)  //method with parameter
	{
		c=a+b+c;
		System.out.println("Addition is  "+c);
		
		
		
	}
	
	
	
	
}
