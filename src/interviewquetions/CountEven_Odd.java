package interviewquetions;

public class CountEven_Odd {

	public static void main(String[] args) {
		int num=12345;
		int rem=0;
		int even_num=0;
		int odd_num=0;
		while(num>0)
		{
			rem=num%10;//5//4//3//2
			if(rem%2==0)
			{
				//System.out.println("Even numbers:"+rem);
				even_num++;//1//2
			}else
			{
				//System.out.println("Odd Numbers:"+rem);
				odd_num++;//1//2
			}
			num=num/10;//1234//123//12
			
		}
		System.out.println("Even number: "+even_num);
		System.out.println("Odd number:"+odd_num);

	}

}
