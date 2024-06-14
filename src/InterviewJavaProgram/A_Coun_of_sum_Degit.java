package InterviewJavaProgram;

import java.util.Scanner;

public class A_Coun_of_sum_Degit {

	public static void main(String[] args) {

		int a = 123456789;

		int Sum =0;
		int count=0;
		while (a>0) {

			Sum = Sum+a%10;
			a=a/10;
			count++;
		}
		System.out.println(Sum);
		
		System.out.println(count);




	}
}
