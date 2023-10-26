package InterviewJavaProgram;

public class CountNumber {

	public static void main(String[] args) {

		int num = 1233444446;
		
		int count=0;
		
		while ( num>0) {
			
			num = num/10;
			count++;
		}
		System.out.println(count);
	}

}
