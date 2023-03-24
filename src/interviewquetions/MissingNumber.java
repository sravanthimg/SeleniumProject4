package interviewquetions;

public class MissingNumber {

	public static void main(String[] args) {
		int a[]= {1,2,4,5,6};
		//sum1=1+2+4+5+6=18
		//sum2=1+2+3+4+5+6=21
		//sum2-sum1=21-18=3
		
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println(sum1);
		
		int sum2=0;
		for(int i=0;i<=6;i++)
		{
			sum2=sum2+i;
		}
		System.out.println(sum2);
		System.out.println("Missing Number:"+(sum2-sum1));

	}

}
