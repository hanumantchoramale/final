package Programs;

public class Fibnossi {

	public static void main(String[] args) {
		
		int n=10;
		int first=0,second=1;
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(first+",");
			int third=first+second;
			first=second;
			second=third;
		}

	}

}
