package pyramid_pattern;

import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		
		
		for ( int i=1;i<5;i++){
			for ( int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for ( int j=1;j<i;j++) {
				System.out.print("*");
			}
			for ( int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();

		}


		for ( int i=1;i<=5;i++){
			for ( int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for ( int j=i;j<5;j++) {
				System.out.print("*");
			}
			for ( int j=i;j<=5;j++) {
				System.out.print("*");
			}
			
			System.out.println();

		}
		
		int n =5;
		for (int i=1;i<n;i++) {
			for (int j=1;j<=i;j++){
				System.out.print("*");
			}
			for ( int j=i; j<n;j++) {
				System.out.print(" ");

			}
			for ( int j=i; j<n;j++) {
				System.out.print(" ");

			}
			for ( int j=1; j<=i;j++) {
				System.out.print("*");

			}
			
			
			
			System.out.println();
		}
		for (int i=1;i<=n;i++) {
			for (int j=i;j<=n;j++){
				System.out.print("*");
			}
			for ( int j=1;j<i;j++) {
				System.out.print(" ");

			}
			for ( int j=1;j<i;j++) {
				System.out.print(" ");

			}
			for ( int j=i;j<=n;j++) {
				System.out.print("*");

			}


			System.out.println();
		}
		
		
		
	
		
		
		}
}
