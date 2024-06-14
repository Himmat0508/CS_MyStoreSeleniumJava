package InterviewJavaProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remov_Dublicate_char {

	public static void main(String[] args) {

		
		String s = "Himmat";
		int a = s.length();
		
		LinkedHashSet<Character>	s1 = new LinkedHashSet<Character>();
	
	for ( int i=0;i<a;i++) {
		s1.add(s.charAt(i));
	}
	
	for ( Character p:s1) {
		System.out.print(p);
	}
		
		
		
	}

}
