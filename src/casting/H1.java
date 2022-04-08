package casting;

public class H1 {

	public static void main(String[] args) {
	}
		
		void s1 () {System.out.println("s1");}
		void s2() {System.out.println("s2");}
	}
		
	class sapna2 extends H1 {
		public static void main(String[] args) {
			 H1 s=new sapna2();
			 s.s1();
			 s.s2();
		}
		void s1() {
			System.out.println(" second s1");}
			void s2() {
				System.out.println(" second s2");
			}
		
	}


