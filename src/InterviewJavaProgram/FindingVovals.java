package InterviewJavaProgram;

public class FindingVovals {

	public static void main(String[] args) {

		String a = "wealcome";
		
		for ( int i=0;i<=a.length();i++) {
			
			if ( a.charAt(i)=='a' || a.charAt(i+1)=='o') {
				System.out.println(i);
			}
			
		}
		
		
		
				
	}

}
