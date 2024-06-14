package pyramid_pattern;

public class half_pyramid_using {

	public static void main(String[] args) {

		
		int row=5;
		
		for ( int i =1, p='A';i<=row;i++,p++) {
			for ( int j=i;j<=row;j++) {
				System.out.print((char)p+" ");

			}
			System.out.println();
		
		}
		
		for ( int i=1;i<=5;i++) {
			for (int j=1; j<=i;j++) {
				if ( i%2==0) {
					System.out.print("B");
				}
				else {
					System.out.print("A");
					
				}
				
			}
			System.out.println();
		}

		String a = "Himmat";
		int s = a.length();
		
		for ( int i=1, p=5;i<=6;i++,p--) {
			for ( int j=1;j<=i;j++) {
				System.out.print(a.charAt(p)+"");
			}
			System.out.println();
		}
		
		
				
		for (int i=1, m=5;	 i<=5;i++,m--) {
			//int p=s;
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
		}
          for ( int k=1;k<=i;k++) {
				System.out.print(a.charAt(m)+"");

          }
	System.out.println();
	}
	}
	}
