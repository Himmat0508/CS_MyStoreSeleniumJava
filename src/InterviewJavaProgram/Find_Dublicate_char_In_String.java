package InterviewJavaProgram;

public class Find_Dublicate_char_In_String {

	public static void main(String[] args) {

		
		String name = "Himmatsinghnathawat";
		int lenght =name.length();
		char [] ch =name.toCharArray();
		int count=0;
		
		for ( int i=0;i<lenght;i++) {
			for ( int j =i+1;j<lenght;j++) {
				if (ch[i]==ch[j] && i!=j) {
					System.out.println("Dublicate char is :" + ch[j]);
					count++;
					break;
				}
			}
			
		}
		System.out.println(count);

	}

}
