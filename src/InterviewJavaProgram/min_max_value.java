package InterviewJavaProgram;

public class min_max_value {

	public static void main(String[] args) {

	
		int a[] = {30,40,20,50,66,70,99,10};
		
		int max = 0;
		
		for ( int i=0; i<a.length;i++) {
			
			if ( max<a[i]) {
				
				max = a[i]	;
			}
		}

		System.out.println(max);
		
	}

}
