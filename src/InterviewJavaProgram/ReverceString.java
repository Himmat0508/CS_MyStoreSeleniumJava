package InterviewJavaProgram;

import java.util.Scanner;

public class ReverceString {

	public static void main(String[] args) {


		//Scanner sc = new Scanner(System.in);
		
		String name = "Himmat";
		int a= name.length();
		
		String s = "";
		
		for ( int i=a-1;i>=0;i--) {
		
		s = s+ name.charAt(i);
		}
		System.out.println(s);
	}
	 

}
