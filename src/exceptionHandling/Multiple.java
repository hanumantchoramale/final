package exceptionHandling;

public class Multiple {

	public static void main(String[] args) {
	// one try block along with multiple catch
		int a=10;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println(c);
			
		}
//		catch (Exception e)//after this catch ..other catch are unreachable bcz it cover all exception
//		{
//			System.out.println("Generic Exception caught");
//		}
		
		catch (Exception e)//after this catch ..other catch are unreachable bcz it cover all exception
		{
			e.printStackTrace();
			System.out.println("Generic Exception caught");
		}
		
//		catch (ArithmeticException e) {
//			System.out.println("value cannot divide by zero");
//		}
//		catch (NullPointerException e) {
//			System.out.println("can not perform action on null value");
//		}
//		catch (StringIndexOutOfBoundsException e) {
//		   System.out.println("check string index"); 
//		   
//		}
//		catch (Exception e)//after this catch ..other catch are unreachable bcz it cover all exception
//		{
//			System.out.println("Generic Exception caught");
//		}
		
		finally {
			System.out.println("Hii finally block");
		}
		
		
		
		
		

	}

}
