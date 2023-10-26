package InterviewJavaProgram;

public class Swapping2Number {

	public static void main(String[] args) {

		int a=10, b=20;
		
	//	System.out.println("Before swapping number: "+a+"  "+b );
		//logic 1 - using third veriable
		//int t=a;
		//a=b;
		//b=t;
		
		//logic 2- use + & - without useing third variable
		
		 a = a+b;  // 10+20 = 30
		 b = a-b; // 30-20=10
		 a= a-b; // 30-10 = 20
		
		
		System.out.println("after swapping number: "+a+"  "+b );

	}

}
