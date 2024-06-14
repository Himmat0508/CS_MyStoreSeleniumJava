package InterviewJavaProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Remove_Dublicate_Elemant {

	public static void main(String[] args) {

		
		int a[] = {10,20,30,40,50,40};
		//first apporch
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		
		for ( int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		for (int s:hs) {
			System.out.print(s+" ");
		}
		
		
		//second apporch
	/*	int j=0;
		for ( int i=0;i<a.length-1;i++) {
			
			if ( a[i]!=a[i+1]) {
				
				a[j] = a[i];
				j++;
			}
			
		}
		a[j] = a[a.length-1];
		
		for (int i=0;i<j+1;i++) {
			System.out.print(a[i]+" ");
		}*/
	}

}
