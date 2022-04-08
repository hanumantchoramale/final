package methods;

public class Call_parameter_method {

	public static void main(String[] args) {
		
		//call static method with parameter
		
		Parameter_method.demo("Hanumant", "velapur",9561238149l ,66.4f, 'A');
		
		//call nonstatic mehod with parameter
		//create object
		Parameter_method pm=new Parameter_method();
		pm.addition(3244, 3430, 5460);
		

	}

}
