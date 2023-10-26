package InterviewJavaProgram;

public class largestg_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=50,c=30 , d=80;
		
		/*if ( a>b && a>c) {
			System.out.println(a+    " is largest number");
		}
		else if ( b>a && b>c) {
			System.out.println(b+    " is largest number");
		}
		else {
			System.out.println(c+    " is largest number");
		}*/
		
		// Ternary Opretor
		
		int largest1 = a>b?a:b;
		int largest2 = c>largest1?c:largest1;
		int largest3 = d>largest2?d:largest2;
		
				

		System.out.println(largest3);
	}

}
