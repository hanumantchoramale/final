package casting;

public class primitie {

	public static void main(String[] args) {
		//implicit casting(lower to higher)
		
		int a=10;
		System.out.println("Value of a is "+a);
		double b=a;
		System.out.println("Value of b is "+b+"\n");

		//explicit casting(higher to lower)
		
		double c=122.2356666;
		System.out.println("Value of c is "+c);
		byte d=(byte) c;  //add cast to int
		System.out.println("Value of d is "+d);
	}

}
