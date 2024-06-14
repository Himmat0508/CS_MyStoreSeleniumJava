package InterviewJavaProgram;

public class Curector_count_inString {

	public static void main(String[] args) {

		
		String a = "Himmat Singh Namthawat";
		
	int TotalCount = a.length();
		
		 int count_afterRemove = a.replace("m", "").length();
		 
		 System.out.println(TotalCount-count_afterRemove);
	}

}
