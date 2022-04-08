package abstract_study;

public class P1 extends rectangle 
  {
	public static void main(String[] args) {
		P1 p=new P1();
		p.write();
		p.refill();
		p.draw();
				
	}	
}

 abstract class Pen
 {
	 public abstract void write();
	 public abstract void refill(); 
 }
 
 class Fountainpen extends Pen
 {
	public void write() {
		System.out.println("writing smoothly ");
 }
	public void refill() {
		System.out.println("one refill free with  2 pen ");
	} 
 }
 
 abstract class shape extends Fountainpen
 {
	abstract void draw(); 
 }
 
 class rectangle extends shape
 {
	void draw() 
	{
		System.out.println("drawing rectangle");
	}
 }
