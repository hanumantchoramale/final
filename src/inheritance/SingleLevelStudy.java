package inheritance;

public class SingleLevelStudy {

	public static void main(String[] args)
	{
		Mother m=new Mother(); //Create object of mother class
		m.look();          //call non static method from mother class
		Mother.money();  //call static method from mother class
		
		
		System.out.println("\n");
		
		Daughter d=new Daughter(); //create object of daughter class
		d.scooty();              //call non static method from daughter class
		Daughter.mobile();     //call static method from daughter class
		d.look();     //call mother method by using daughter class object
		Daughter.money(); // call mother class  method by using daughter class  
	   

	}

}
