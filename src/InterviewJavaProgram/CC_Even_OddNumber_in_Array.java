package InterviewJavaProgram;

import java.util.ArrayList;

public class CC_Even_OddNumber_in_Array {

	public static void main(String[] args) {
		
		

		int a[] = {1,2,3,4,5,6};
		
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();

		
		for ( int i=0;i<a.length;i++) {
			
			if ( a[i]%2==0) {
				a1.add(a[i]);
			}
			else {
				a2.add(a[i]);
			}
			
		}
		System.out.println("even number");
		for ( int no:a1) {
			

			System.out.println(no);
		}
		

		System.out.println("odd number");

		for ( int no:a2) {
			System.out.println(no);
		}
	}

}
