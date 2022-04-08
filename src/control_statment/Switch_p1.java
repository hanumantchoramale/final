package control_statment;

public class Switch_p1 {
	
	public static void s1(String name, long mob_no,float per)
	{
	     System.out.println("=======================================");
		System.out.println("Name of student is - "+name);
		System.out.println("Mobile number is - "+mob_no);
		System.out.println("Percentage is - "+per);
		System.out.println("----------------------------------------");
	}

	public static void main(String[] args) 
	{
		String stud_name="Samir";
		
		switch (stud_name) {
		case "Hanumant":
			s1("Hanumant", 9561238149l, 84.34f);
			break;
		case"Amar":
			s1("Amar", 8888146061l, 82.78f);
			break;
		case"Samir":
			s1("Samir", 7066215357l, 80.88f);
			break;
		case"Swapnali":
			s1("Swapnali", 9096272373l, 83.43f);
			break;
		case"Nisha":
			s1("Nisha", 9960587693l,82.56f);
			break;
		default:
			System.out.println("Do not match to student data");
			break;
		}

	}

}
