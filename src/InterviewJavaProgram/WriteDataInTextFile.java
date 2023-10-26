package InterviewJavaProgram;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInTextFile {

	public static void main(String[] args) throws IOException {

		
		FileWriter fe = new FileWriter("C:\\Document PDF\\test.txt");
		
		BufferedWriter bf = new BufferedWriter(fe);
		
		bf.write("this is first class");
		bf.write("this is first test");
		bf.write("this is first class");
		bf.write("this is first class");
		
		System.out.println("finshed!!!");
		bf.close();
		
		
	}

}
