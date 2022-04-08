package inheritance;

public class MultilevelStudy {

	public static void main(String[] args) 
	{
		Daughter d=new Daughter(); //create object of subclass
//		d.experience(); //call non-static method of super-most class by using sub class object
		d.look(); //call non_static method of super class by using sub class object
		d.scooty(); //call non_static method of own class by using own class object
		Daughter.mobile(); //call static method of own class by using own class method name
		Daughter.money();//call static method of super class by using sub class method name

	}

}
