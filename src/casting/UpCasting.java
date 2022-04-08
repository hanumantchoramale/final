package casting;

public class UpCasting extends uc1 {

	public static void main(String[] args) {	
		uc1 u=new UpCasting();	
		u.h1();
		u.h2()	;
	}
	void h1()
	{
		System.out.println("H1 of upcasting");
	}
	void h2()
	{
		System.out.println("H2 of upcasting");
	}
}
class uc1 {
	
	void h1()
	{
		System.out.println("H1 of uc1");
	}
	void h2()
	{
		System.out.println("H2 of uc1");
	}
	
	
}
