package InterviewJavaProgram;

import java.util.HashSet;

public class DublicateString_In_array {

	public static void main(String[] args) {

		String a[]= {"java,c,paytheon,c++,java"};
		
		/*boolean flag=false;
		for ( int i=0;i<=a.length;i++) {
			for ( int j=i+1;j<=a.length;j++) {
				
				if (a[i]==a[j]) {
					System.out.println("found dublicate:"+a[i]);
					flag = true;
				}
			}*/
		
		HashSet has= new HashSet();
		
		System.out.println(has.add("java")); 
		System.out.println(has.add("java"));
		System.out.println(has.add("c")); 
		
		
		
		
				
		
		}
		

}
