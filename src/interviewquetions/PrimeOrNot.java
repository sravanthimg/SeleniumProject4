package interviewquetions;

public class PrimeOrNot {

	public static void main(String[] args) {
		//Natural Number>1
		//Which has only 2 factors 1 and itself
		int num=0;//1 or 5
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)//
				{
					count++;//1//2
				}
			}
			if(count==2)
			{
				System.out.println("Prime Number");
			}else
			{
				System.out.println("Not a Prime Number");
			}
		}else
		{
			System.out.println("Not a Prime Number");
		}
	}

}
