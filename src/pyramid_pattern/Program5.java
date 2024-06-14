package pyramid_pattern;

public class Program5 {

	public static void main(String[] args) {

		for ( int i=1;i<=4;i++) {
			for (int j=1; j<=i;j++) {
				
				if ( i>=2 && j<=i-1) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");

				}

			}
			System.out.println();
		}
		
		
		for ( int i=1;i<=4;i++) {
			for ( int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for ( int l=1;l<=i;l++) {
				
				if ( i>=2 && l>1) {
					System.out.print("");
				}
				else {
					System.out.print("*");

				}
			}
			System.out.println();

		}
		
		
		}}


