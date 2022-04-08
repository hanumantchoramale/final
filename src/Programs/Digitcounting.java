package Programs;

public class Digitcounting {

	public static void main(String[] args) {
		int a=1245;
		int b=0;
		while(a>0)
		{
			a=a/10;
			b=b+1;
		}
       System.out.println(b);
	}

}
