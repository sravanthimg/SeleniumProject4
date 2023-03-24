package interviewquetions;

public class MissingNumberInArray {

	public static void main(String[] args) {
		//Array should not have dublicates
		//Array No need to be sorted order
		//Values should be in range
		
		int a[]= {1,2,3,4,5,6,7,9,10};
		
		//1+2+4+5+6=18 sum1
		//1+2+3+4+5+6=21 sum2
		//sum2-sum1=3 missing
		
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of Elements in Array: "+sum1);
		
		int sum2=0;
		for(int i=1;i<=10;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of range of Elements in Array: "+sum2);
		
		System.out.println("Missing Number in Array is: "+(sum2-sum1));
	}

}
