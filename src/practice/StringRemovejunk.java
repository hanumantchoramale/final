package practice;

public class StringRemovejunk {

	public static void main(String[] args) {
		 
		String s="Ha^&*numant &%@^&*( Cho$%^ramale#$%^";
		System.out.println(s.replaceAll("[^a-zA-Z0-9]",""));
	}

}
