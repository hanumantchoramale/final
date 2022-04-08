package polymorphism;

public class Overloading {
	int a=10;
	String b="Hanumant";
	int a1=30;

	public static void main(String[] args) {
		Overloading o=new Overloading();
	     o.s1();
	     o.s1(12, "Hanumant", 123);
	     o.s1(12.45f,"Samir", 0);
	     o.s1(94,"Amar",65);
	     o.s1(54, "Sapna", 12);
	}

	public void s1()
	{
	}
	
	public void s1(int a,String b,int a1)
	{
		System.out.println(a+b+a1);
	}
	public void s1(float a,String b,float a1)
	{
	}
	public void s1(short a,String b,short c) {
	}
	public void s1(byte a,String b,byte c) {
	}
	
}
	
