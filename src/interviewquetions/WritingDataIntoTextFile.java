package interviewquetions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fl=new FileWriter("C:\\New folder\\Test.text");
		BufferedWriter bw=new BufferedWriter(fl);
		bw.write("Welcome to Java");
		bw.write("Welcome to Python");
		bw.write("Welcome to C#");
		bw.write("Welcome to C");
		System.out.println("Finished....");
		bw.close();
		
	}

}
