package InterviewJavaProgram;

public class Removing_SpaceFrom_string {

	public static void main(String[] args) {

		
		String a = "    Himmat     singh    Nathawat";
		
		a = a.replaceAll("\s","");
	String	s = a.replaceAll("[^a-z]","");

		
String 	p=	a.trim();
		
		System.out.println(a); 	
		System.out.println(p);
		System.out.println(s);
	}

}
