package pyramid_pattern;

public class AlfabatePattern {

	public static void main(String[] args) {

		
		int n=5;
		
		for (int i=1;i<=n;i++) {
			int  p='A';
			for (int j=1;j<=i;j++) {
				System.out.print((char)p++ +" ");
			}
			System.out.println();
		}
		
		for (int i=1;i<=n;i++) {
			
			for (int j=1;j<=i;j++) {
				
				if ( i%2==0) {
				System.out.print('A');
			}
				else {
					System.out.print('B');

				}
	}
			System.out.println();

		}
		
		
		for ( int i=1;i<=n;i++) {
			int p='A';
			for (int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for ( int j=1;j<i;j++) {
				System.out.print((char)p++ +"");
			}
			for ( int j=1;j<=i;j++) {
				System.out.print((char)p-- +"");
			}
			System.out.println();
		}
		
		
		//by name
		
		String s = "Coder";
		int a = s.length();
		
		for ( int i=1,p=0;i<=a;i++,p++) {
			for ( int j=i;j<=n;j++) {
			System.out.print(" ");
			}
			for ( int j=1;j<i;j++) {
				System.out.print(s.charAt(p) +"");
				}
			for ( int j=1;j<=i;j++) {
				System.out.print(s.charAt(p) +"");
				}
			System.out.println();
		}
		
		
		for ( int i=1,p=4;i<=a;i++,p--) {
			for ( int j=i;j<=n;j++) {
			System.out.print(" ");
			}
			for ( int j=1;j<i;j++) {
				System.out.print(s.charAt(p) +"");
				}
			for ( int j=1;j<=i;j++) {
				System.out.print(s.charAt(p) +"");
				}
			System.out.println();
		}
		
		
		for ( int i=1;i<=a;i++) {
			int p=0;
			for ( int j=i;j<=n;j++) {
			System.out.print(" ");
			
				}
			for ( int j=1;j<=i;j++) {
				System.out.print(s.charAt(p++) +" ");
			}
			for ( int j=1;j<=i;j++) {
				System.out.print(s.charAt(p++) +" ");
			}
			System.out.println();
		}
}}
