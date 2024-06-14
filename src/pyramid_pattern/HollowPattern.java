package pyramid_pattern;

public class HollowPattern {

	public static void main(String[] args) {

		int n = 5;
		// Square pataller bar pattern 
		for ( int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				
				if (j==1 || j==n) {
					System.out.print("* ");

				}
				else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}
		
		
	// 	Square puls bar pattern
		
		for ( int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				
				if (i==n/2+1 || j==n/2+1) {
					System.out.print("* ");

				}
				else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}
		
		//cross pattern 
		for ( int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				
				if (i==j || i+j==n+1) {
					System.out.print("* ");

				}
				else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}
		
		
		// square box pattern 
		for ( int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				
				if (i==1||j==1 || i==n ||j==n) {
					System.out.print("* ");

				}
				else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}
		
		// hollow incriging tryengle
		
		for ( int i =1; i<=n;i++) {
			for ( int j=1;j<=i;j++) {
				if ( i==n|| j==1||j==i) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");

				}
				
			}
			System.out.println();
		}
		
		// hollow Hill pattern
		
		for ( int i=1;i<=5;i++){
			for ( int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for ( int j=1;j<=i;j++) {
				if( i==n || j==1) {
			
				System.out.print("*");
				}
				else {
					System.out.print(" ");

				}
			}
			for ( int j=1;j<=i;j++) {
				if( i==n || j==i) {
					
					System.out.print("*");
					}
					else {
						System.out.print(" ");
				
			}
			
			System.out.println();
		
			}
	
}}}
