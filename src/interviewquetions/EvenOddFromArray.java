package interviewquetions;

public class EvenOddFromArray {

	public static void main(String[] args) {
		int a[]= {2,1,5,3,4,8};//6
		//Exracting Even Numbers
		System.out.println("Even numbers of Array....");
		for(int i=0;i<=a.length-1;i++)//5
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		/*for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
		}*/
		System.out.println("Odd Numbers of Array....");
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		/*for(int value:a)
		{
			if(value%2!=0)
			{
				System.out.println(value);
			}
		}*/
		

	}

}
