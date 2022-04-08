package array;

public class Multidimentional {

	public static void main(String[] args) {
		int s[][]=new int[2][2];
        s[0][0]=10;
		s[0][1]=20;
		s[1][0]=30;
		s[1][1]=40;
		
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
