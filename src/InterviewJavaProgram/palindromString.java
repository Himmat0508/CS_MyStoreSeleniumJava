package InterviewJavaProgram;

public class palindromString {

	public static void main(String[] args) {

		String name = "MAM";
		int n = name.length();
		String s = "";
		
		for ( int i=n-1;i>=0;i--) {
			
			s = s+name.charAt(i);
		
		}
		if ( name.equals(s)) {
			System.out.println("this is palindrom string");
		}
		else {
			System.out.println("this is not palindrom string");
		}
	}

}
