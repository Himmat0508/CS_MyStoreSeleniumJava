package InterviewJavaProgram;

public class FindingVovals {

	public static void main(String[] args) {

		String str = "Himmaat";
		int count=0;
		
		
		for ( int i=0;i<str.length();i++) {
			
			if ( str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='r') {
				
				count++;
			}

		}
		System.out.println(count);


}
}