package InterviewJavaProgram;

import java.util.Scanner;

public class CCCC_ReverceNumber {

	public static void main(String[] args) {

		
		int no = 987654321, rem = 0, rev=0;
		
		while ( no!=0) {
			
			rem = no%10;
			rev = rev*10+rem;
			no = no/10;
		}
	System.out.println(rev);
		//}
		
		//Using StingBuffer
		
		/*StringBuffer nu = new StringBuffer("4321");
		StringBuffer rev = nu.reverse();
		
		System.out.println(rev);*/
		
		
		// Using StringBuilder
		
		/*StringBuilder sc = new StringBuilder ( "987654321");
		
		StringBuilder rev = sc.reverse();
		
		System.out.println(rev);*/
		
		}
		
	}


