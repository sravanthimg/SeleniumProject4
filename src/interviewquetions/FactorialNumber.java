package interviewquetions;

public class FactorialNumber {

	public static void main(String[] args) {
		//5!=1*2*3*4*5=120
		int num=5;
		int factorial=1;
		/*for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial of Number: "+factorial);*/
		
		for(int i=num;i>=1;i--)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial of Number: "+factorial);
		
	}

}
