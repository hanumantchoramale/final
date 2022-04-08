package control_statment;

public class Practice {

	public static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
	public void sub(int a,int b)
	{
		int sub=a-b;
		System.out.println("Substraction is "+sub);
	}
	public void mul(float a, float b)
	{
		float mul=a*b;
		System.out.println("Multiplication is "+mul);
	}
	public static void div(float a,float b)
	{
		float div=a/b;
		System.out.println("Division is "+div);
	}
	
	public static void main(String[] args) {
		
    Practice p1=new Practice();
    System.out.println("Enter \n1 for addition\n2 for subtraction\n3 for multiplication\n4 for division");
    int methods=4;
switch (methods)
{
case 1:
	add(26, 345);
	break;
case 2:
	p1.sub(3456, 634);
	break;
case 3:
	p1.mul(3356.43f, 535.f);
	break;
case 4:
	div(555, 55);
	break;

default:
	System.out.println("Not match any method");
	break;
}

	}
}
