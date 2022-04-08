package interfaceStudy;

public class MultipleInheritance implements MH2,MH1{

	public static void main(String[] args) {
		 MultipleInheritance m=new  MultipleInheritance();
		 m.test1();
		 m.test2();
		 m.same();
		 MH1.common();
		 MH2.common();
		 
}     
	public void test2() {
	     System.out.println("MH2 test2 method\n");	
	}
	public void test1() {
		System.out.println("MH1 test1 method");	
	}
	public void same() {
	  System.out.println("Same method,which class'I Don't Know'");
	  MH1.super.same();
	  MH2.super.same();
		
	}

}
