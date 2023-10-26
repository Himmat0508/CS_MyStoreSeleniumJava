package InterviewJavaProgram;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Shorting_Elimant {

	public static void main(String[] args) {

		Integer a[] = {10,30,50,20,60};
		System.out.println("befour shorting: " +Arrays.toString(a));

		// Short the array
		//Arrays.parallelSort(a);
		//Arrays.sort(a);
		
		// desending the array number
		
		Arrays.sort(a, Collections.reverseOrder());
		
		System.out.println("after shorting: " +Arrays.toString(a));
	}

}
