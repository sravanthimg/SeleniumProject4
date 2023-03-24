package interviewquetions;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.next();//ABCD
		String rev="";
		//int len=str.length();//4
		
		//Using +(String concatenation)Operator
		/*for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);//D+C=DC//DC+B=DCB//DCB+A=DCBA
		}
		System.out.println("Reverse A String:"+rev);*/
		
		//Using Character array
		
		/*char a[]=str.toCharArray();
		int len=a.length;//4
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];//DCBA
			
		}
		System.out.println("Reverse A String:"+rev);*/
		
		//Using StringBuffer
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		

	}

}
