package InterviewJavaProgram;

import java.util.Scanner;

public class CountThe_Word {

	public static void main(String[] args) {
		
		
		
		System.out.println("please enter the word");


		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		
	int	count = 1;
		
		for ( int i=0;i<=s.length()-1;i++) {
			
			if ((s.charAt(i)==' ')&& (s.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println("word count is :" +count);
	}

}
