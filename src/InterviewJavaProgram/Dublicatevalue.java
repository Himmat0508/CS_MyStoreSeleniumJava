package InterviewJavaProgram;

import java.util.HashSet;
import java.util.Set;

public class Dublicatevalue {

	public static void main(String[] args) {

		// Brute force mathord 
		
		int a[] = {8,2,1,2,5,3,5,7,8};
		
		for ( int i=0; i<a.length;i++) {
			for ( int j=i+1;j<a.length;j++) {
				
				if ( a[i] ==a[j] && i!=j ) {
					System.out.println(a[j]);
				}
			}
		}
		
		// Set interface
		
		/*int b[] = { 4,6,4,7,8,2,1,2,8};
		
		Set<Integer> s = new HashSet<>();
		
		for ( int no:b) {
			
			if (s.add(no)==false) {
				
				System.out.println(no);
			}
		}*/
		
	}

}
