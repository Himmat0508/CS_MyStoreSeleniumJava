package InterviewJavaProgram;

public class Even_Odd_Number {

	public static void main(String[] args) {

		int num = 1234567888;
		
		int even_number=0;
		int odd_number=0;
		
		while ( num>0) {
			
		int rem = num%10;
			
			if ( rem%2==0) {
				even_number++;
			}
			else {
				odd_number++;
			}
			num=num/10; 
		}
		System.out.println(even_number);
		System.out.println(odd_number);
	}

}
