package InterviewJavaProgram;

public class Removing_SpaceFrom_string {

	public static void main(String[] args) {

		
		String a = "    Himmat     singh    Nathawat";
		
		a = a.replaceAll("\\s", "");
		
		System.out.println(a); 	
	}

}
