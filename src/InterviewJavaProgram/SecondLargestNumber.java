package InterviewJavaProgram;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int a[] = {6,8,2,4,1,5,7};
		int tem=0;
		for ( int i=0; i<a.length;i++) {
			for ( int j=i+1;j<a.length;j++) {
				
				if ( a[i] < a [j]){
					
					// tem = a[i];
					a[i] = a[j];
					a[j] = tem;
					
				}
			}
		}
		System.out.println(a[1]);
	}

}
