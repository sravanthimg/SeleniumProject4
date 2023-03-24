package interviewquetions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingDataFromTextFile {

	public static void main(String[] args) throws IOException {
		//Approach1 Using FileReader And BufferReader
		
		/*FileReader fi=new FileReader("C:\\Users\\Harsha\\Desktop\\New Text Document (2).txt");
		BufferedReader br=new BufferedReader(fi);
		
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();*/
		
		//Approach2 Using Scanner and File
		File f=new File("C:\\\\Users\\\\Harsha\\\\Desktop\\\\New Text Document (2).txt");
		Scanner sc=new Scanner(f);
		
		/*while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}*/
		
		//Approach3
		sc.useDelimiter("\\Z");
		System.out.println(sc.next()
				);
		
		

	}

}
