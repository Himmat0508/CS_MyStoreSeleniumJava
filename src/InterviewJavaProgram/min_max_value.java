package InterviewJavaProgram;

public class min_max_value {

	public static void main(String[] args) {

		int a[]= {50,30,400,60,100};
		
		int max = a[0];
		
		for ( int i=1;i<a.length;i++) {
			
			if ( a[i]>max) {
				
				max = a[i];
			}
			
		}
		System.out.println(max);

	}

}
