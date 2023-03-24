package interviewquetions;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.next();//MADAM
		String org_str=str;
		String rev="";
		int len=str.length();//5
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);//MADAM
		}
		System.out.println(rev);
		if(org_str.equals(rev))
		{
			System.out.println(org_str+" Palindrome String");
		}else
		{
			System.out.println(org_str+" Not Palindrome String");
		}
	}

}
