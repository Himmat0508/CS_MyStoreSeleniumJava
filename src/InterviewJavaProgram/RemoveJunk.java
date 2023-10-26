package InterviewJavaProgram;

public class RemoveJunk {

	public static void main(String[] args) {

	
		String a = "@!#$%^&*(   Himmat11345";
		
		a = a.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(a);
	}

}
