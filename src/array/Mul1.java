package array;

public class Mul1 {

	public static void main(String[] args) {
		int s[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<=s.length-1;i++)
		{
			for(int j=0;j<=s.length-1;j++)
			{
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}

	}

}
