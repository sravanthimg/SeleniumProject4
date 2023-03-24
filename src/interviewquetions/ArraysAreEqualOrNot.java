package interviewquetions;

import java.util.Arrays;

public class ArraysAreEqualOrNot {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int a1[]= {1,2,3,4,5};
		
		
		//Approach1
		/*boolean status=Arrays.equals(a, a1);
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}else
		{
			System.out.println("Arrays are not equal");
		}*/
		
		//Approach2
		boolean status=true;
		
		if(a.length==a1.length)
		{
			//compare rest of elements
			for(int i=0;i<a.length;i++)//5
			{
				if(a[i]!=a1[i])//2!=2
				{
					status=false;
				}
			}
		}else
		{
			status=false;
		}
		if(status==true)
		
		{
			System.out.println("Arrays are equal");
		}else
		{
			System.out.println("Arrays are not equal");
		}
	}

}
