package Programs;

public class HcfLcm {

	public static void main(String[] args) {

   int a=50,b=60;
   int count=0;
   for(int i=1;i<=a;i++)
   {
	   if(a%i==0 && b%i==0)
		   System.out.println(i);
   }
   int hcf=0;
   for (int i=1;i<=a;i++)
   {
	   if(a%i==0 && b%i==0)
	   hcf=i;
   }
   System.out.println(hcf);
   
   
   int lcm=a*b/hcf;
   System.out.println(lcm);
	}
	
	

}
