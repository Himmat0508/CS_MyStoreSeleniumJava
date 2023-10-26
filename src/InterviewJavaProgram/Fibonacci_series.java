package InterviewJavaProgram;

public class Fibonacci_series {

	public static void main(String[] args) {
		
		int n1 = 0, n2=1, sum=0;
		
		for ( int i=2; i<10;i++) {
			
			sum = n1+n2; //2+3
			System.out.println(sum); // 1 2 3 5 8
			n1=n2; //5
			n2=sum; // 1 2 3 5 8
			
			
		}
	}

}
