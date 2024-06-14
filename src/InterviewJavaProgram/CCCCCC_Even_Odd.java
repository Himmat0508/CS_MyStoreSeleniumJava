package InterviewJavaProgram;

public class CCCCCC_Even_Odd {

	public static void main(String[] args) {

		int a[] = { 1,2,3,4,5,6,7,8};
		int count=0;
		
		System.out.println("even No..........");

		for ( int i=0; i<a.length;i++) {
			
			if (a[i]%2==0) {

				System.out.println(a[i]);
			}
						
			
		}
		System.out.println("odd No..........");

			for ( int i=0; i<a.length;i++) {
				
				if (a[i]%2!=0) {
					count++;
					

					System.out.println(a[i]);
					}
				


				

		}
			
			//enhance loop
			System.out.println("Even No..........");

			for ( int value :a) {
				if ( value%2==0) {
					System.out.println(value);
				}
				
					
				
							
		
			}
			System.out.println("odd No..........");

			for ( int value :a) {
				if ( value%2!=0) {
					System.out.println(value);
				}
		}

	}
}
