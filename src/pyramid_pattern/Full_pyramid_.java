package pyramid_pattern;

public class Full_pyramid_ {

	public static void main(String[] args) {

		int row=5;
		int lafavat=1;
		
		
		// Up to down preamid
		for( int i=1; i<=row;i++) {
			for (int j=row; j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				//System.out.print(k+" ");
				System.out.print("* ");

				
			}
			System.out.println();
		}
		
		
		// down to up
		
		for ( int i=1;i<=row;i++) {
			for( int j=1;j<=i;j++) {
				System.out.print(" " );
				
			}
			for(int k=row;k>=i;k--) {
			System.out.print("*");
			}
		for (int l=4;l>=i;l--) {
			System.out.print("1");

		}
		System.out.println();
	}
	}
}
