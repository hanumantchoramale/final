package constuctor;

public class Constructor_practice {

	float a; float b; float c; float d; String name; //variable declare
	
	public Constructor_practice()
	{
		a=56; b=78; c=56; d=65;
	    name="Hanumant";
	    System.out.println("Name of Student - "+name);
		System.out.println("Marks in\n"+"Marathi - "+a+"\n" +"Hindi - "+b +"\n"+"English - "+c +"\n"+"Maths - "+d);		
	}
	public Constructor_practice(String num1, float num2)
	{
		name=num1; a=num2;
		System.out.println("Name of Student - "+name);
		System.out.println("Marks in "+"\r\n"+"Marathi - "+a+"\r\n" +"Hindi - "+b +"\r\n"+"English - "+c +"\r\n"+"Maths - "+d);		
	}
	public Constructor_practice(String num1, float num2, float num3)
	{
		name=num1; b=num2; d=num3;
		System.out.println("Name of Student - "+name);
		System.out.println("Marks in "+"\r\n"+"Marathi - "+a+"\r\n" +"Hindi - "+b +"\r\n"+"English - "+c +"\r\n"+"Maths - "+d);	
	}
	public static void main(String[] args) {
        Constructor_practice cp1=new Constructor_practice();
        cp1.per();
        Constructor_practice cp2=new Constructor_practice("Nikhil", 84);
        cp2.per();
        Constructor_practice cp3=new Constructor_practice("Sagar", 67, 89);
        cp3.per();
}
	public void per()
	{
		float h=(a+b+c+d)/4;
		float sum=a+b+c+d;
		System.out.println("Total of marks -"+sum);
		System.out.println("-----------------------------------------------------------");
		System.out.println("Percentage - "+h+"%");
		System.out.println("============================================================");
		
		
	}









}