package interviewquetions;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();//16461
		int orgnum=num;//16461
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;//0*10+1=1//1*10+6=16//16*10+4=164//164*10+6=1646//1646*10+1=16461
			num=num/10;//1646//164//16//1//0
		}
		System.out.println("Reverse A number: "+rev);
		if(orgnum==rev)
		{
			System.out.println("number is Palindrome number");
		}else
		{
			System.out.println("number is not a Palindrome number");
		}
		

	}

}
