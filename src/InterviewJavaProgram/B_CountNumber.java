package InterviewJavaProgram;

public class B_CountNumber {

	public static void main(String[] args) {

		int num = 1233444446;
		
		int count=0;
		int sum= 0;
		while ( num>0) {
			
			 sum = sum+num%10;
			
			num = num/10;
			count++;
		}
		System.out.println(count);
		System.out.println(sum);
		

	}

}
