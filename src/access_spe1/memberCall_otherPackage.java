package access_spe1;

import access_specifier.AS1;

public class memberCall_otherPackage extends AS1 {

	public static void main(String[] args) {
	
		AS1 as=new AS1(); //for this we need import AS1 property
        as.test1();
        System.out.println("Public variable (b) of another package "+as.b);
        
        // we call only public members from other packages
        //call protected also possible by using inheritance
        
        memberCall_otherPackage mp=new memberCall_otherPackage();
        mp.test3();
        mp.test1();
        System.out.println("Public variable (b) of another package "+mp.b);
        System.out.println("Protected variable (c) of another package "+mp.c);
        
        
        
	}

}
