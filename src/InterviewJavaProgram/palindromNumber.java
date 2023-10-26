package InterviewJavaProgram;

import java.util.Scanner;

public class palindromNumber {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter number :");
		int num = sc.nextInt();
		
		int Org_num = num;
		int rev=0;
		
		while ( num!=0) {
			
			rev = rev*10+ num%10;
			num = num/10;
		}
		if (Org_num==rev) {
			System.out.println("it is pelandrom number:");
		}
		else {
			System.out.println("it is not a palndrom number");
		}
	}

}
