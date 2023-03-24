package interviewquetions;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before swapping values are--"+a+" "+b);
		//Logic1=Third variable
		/*int t=a;//10
		a=b;//20
		b=t;//10*/
		
	//System.out.println("After swapping values are "+a+" "+b);
	//Logic 2-use + & - operators without using third variable
	
		/*a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		System.out.println("After swapping values are "+a+" "+b);*/
	//Logic 3-use * and /without using third variable
	//here a& b values should not be zero
		/*a=a*b;//10*20=200
		b=a/b;//200/20=10
		a=a/b;//200/10=20
		System.out.println("After swapping values are "+a+" "+b);*/
		
		//Logic 4-Single Statement
		b=a+b-(a=b);//a=20 
		
		
	}		

}
