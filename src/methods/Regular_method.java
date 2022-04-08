package methods;

import java.util.Scanner;

public class Regular_method {

	public static void main(String[] args) {
		System.out.println("Steps to create First program");
		
	step1();                            //call static regular method
	System.out.println("Create Project");
	step2();
	System.out.println("Create Pakage-1st letter of package name is in lowercase");
	step2();
	System.out.println("Create class-1st letter of class name is in capital");
	step2();
	System.out.println("Write program and Run");
	step3();

	}
            public static void step1()    //static regular method-->write it inside of class and outside of main method
          {
            	
            	System.out.println("First step is");
          }
            
            public static void step2()
            {
            	System.out.println("Next step");
            }
            public static void step3()
            { 
            	System.out.println("enter value");
            
          
            
            }


}
