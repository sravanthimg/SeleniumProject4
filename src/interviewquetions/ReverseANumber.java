package interviewquetions;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();//1234
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;//0*10+4=4//4*10+3=43//43*10+2=432//432*10+1=4321
			num=num/10;//123//12//1//0
		}
		System.out.println(rev);
	}

}
