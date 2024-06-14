package pyramid_pattern;

public class NumberPattern1 {

	public static void main(String[] args) {

		int n = 5;
		for (int i=1;i<=n;i++) {
			for ( int j=1; j<=i;j++) {
				System.out.print(i);

			}
			System.out.println();

		}
		
		for ( int i=1;i<=n;i++) {
			for (int j=i;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		//Row increamanting by 2
		
		for (int i=1,p=0;i<=n;i++,p+=2) {
			for ( int j=1; j<=i;j++) {
				System.out.print(p+"");

			}
			System.out.println();
		}
		
		
		
		for (int i=1;i<=n;i++) {
			
		int p=1;
			for ( int j=1; j<=i;j++) {
				System.out.print(p++ +"");

			}
			System.out.println();
		
	}
		
		for (int i=1;i<=n;i++) {
			int p=1;
			for ( int j=1; j<=i;j++) {
				
				System.out.print(" ");
			}
				for ( int j=i; j<n;j++) {
					System.out.print(p++ +"");

			}
				for ( int j=i; j<=n;j++) {
					System.out.print(p++ +"");


			}
			System.out.println();
		
		}
		
		for (int i=1;i<=n;i++) {
			int p=1;
			for (int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for (int j=i;j<n;j++) {
				System.out.print(p++ +"");
			
		}
		for (int j=i;j<=n;j++) {
			System.out.print(p-- +"");
		}
			System.out.println();
		}
		
		int p=1;
		for ( int i=1;i<=4;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(p++ +"");
			}
			System.out.println();
		}
		
		

		
		
		
}}
