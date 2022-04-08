package inheritance;

public class Practice {
	

	public static void main(String[] args) {
		
	
		a sapna=new a();
		sapna.add();
		
		b ss=new b();
		ss.sub();
		ss.add();
		c tt=new c();
		tt.mul();
		tt.add();
		
	}	
	}
	class a
	   {
		public void add()
		{
			System.out.println("Addition method ");
		}	
		}
	class b extends a
	{
		void sub()
		{
			System.out.println("Subtraction method");
		}
		}
	class c extends a
	   {
	       protected void mul()
	    {
		System.out.println("Multiplication method");
		}
	}

