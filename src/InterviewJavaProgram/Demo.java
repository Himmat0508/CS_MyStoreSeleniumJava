package InterviewJavaProgram;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Demo {

	static public void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		int p= 'A';

		for ( int i=1;i<=n;i++,p+=2) {


			for ( int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for ( int j=1;j<i;j++) {
				System.out.print((char)p +"");
			}
			for ( int j=1;j<=i;j++) {
				System.out.print((char)p +"");
			}
			System.out.println();
			
		}
		
		
		

	
	

			
		
	
}}


