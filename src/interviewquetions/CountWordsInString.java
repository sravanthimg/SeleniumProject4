package interviewquetions;

import java.util.Iterator;
import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine(); //Welcome to Java//3
		int count=1;
		System.out.println(s.length());
		for (int i = 0; i < s.length()-1; i++) 
		{
			if((s.charAt(i)==' ' )&& (s.charAt(i+1)!=' '))
			{
				count++;//2//3
			}
			
		}
		System.out.println("Number of words in a String:"+count);
	}

}
