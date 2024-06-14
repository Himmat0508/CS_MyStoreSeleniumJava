package pyramid_pattern;

public class Program4 {

	public static void main(String[] args) {

		;
		for ( int i=1; i<=5;i++) {
			int p=1;
			for ( int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for (int k=1;k<i;k++) {
				System.out.print(p++ +"");
			}
			for ( int m=1;m<=i;m++) {
				System.out.print(p-- +"");
			}
			System.out.println();
		
		}	
			for ( int i=1; i<=5;i++) {
				int o=1;
				for ( int j=1;j<=i;j++) {
					System.out.print(" ");
				}
				for (int k=5;k>i;k--) {
					System.out.print(o++ +"");
				}
				for ( int m=5;m>=i;m--) {
					System.out.print(o-- +"");
				}
				System.out.println();
		
	}	
			int count =10;
			
			for( int i=1;i<=4;i++) {
				for ( int k=1;k<=i;k++) {
					System.out.print(" ");
				}
				for ( int j=4;j>=i;j--)
				{
					System.out.print(count--);
				}
				
				System.out.println();
			}
			
			
	}

}
