package inheritance;



 class Addition 
  {
    
	   public void add(int a,int b)
	   {
        System.out.println("Addition is "+(a+b));
	   }
   }
      
	    class Sub1 extends Addition
	   {
		   public void sub(int a,int b)
		   {
			   System.out.println("Substraction is "+(a-b));
		   }
	   }
	   
	    class multiplication1 extends Sub1
	   {
		   public void mul(int a,int b)
		   {
			   System.out.println("Mutiplication is "+(a*b));
		   }
	   }
	   
	
  
      
  
  
