package interviewquetions;

public class SumElementsArray {

	public static void main(String[] args) {
		int a[]= {5,6,7,2,7};
		int sum=0;
		for(int i=0;i<=a.length-1;i++)//4
		{
			sum=sum+a[i];//5+6=11
		}
		System.out.println("Sum of Elements in Array: "+sum);
		
		//by using for each loop ie enhanced loop
		/*for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println("Sum of Elements in Array: "+sum
				);*/
	}
	

}
