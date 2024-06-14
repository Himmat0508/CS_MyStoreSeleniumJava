package InterviewJavaProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Euality_of_two_array {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
		int b[] = {1,2,8,4,5};
		
	boolean p =	Arrays.equals(a, b);
	
	if ( p==true) {
		System.out.println("this is equal");
	}
	else {
		System.out.println("not equal");
	}
	
	
	}

}
