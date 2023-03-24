package interviewquetions;

public class Count_Number_Of_Digits {

	public static void main(String[] args) {
		int num=123456;
		int count=0;
		while(num>0)
		{
			num=num/10;//12345//1234//123//12//1//0
			count++;//1//2//3//4//5//6
		}
		System.out.println("Number of Digits: "+count);

	}

}
