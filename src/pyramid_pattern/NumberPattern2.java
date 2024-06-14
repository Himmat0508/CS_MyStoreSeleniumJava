package pyramid_pattern;

public class NumberPattern2 {

	public static void main(String[] args) {

		int count = 1;
		for (int i=1;i<=4;i++) {
			for (int j=1;j<=i;j++) {
				//for (int j=1;j<=3;j++) 

				
			
			
				
						System.out.print(count++ +"");
			}
			System.out.println();
		}
		
		for (int i=1;i<=4;i++) {
			for ( int j=4;j>=i;j--) {
				System.out.print(count);
				count=count-1;
			}
			System.out.println();

		}
	}

}
