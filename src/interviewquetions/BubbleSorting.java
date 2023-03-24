package interviewquetions;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		int a[]= {2,4,1,3,7,9};
		System.out.println("Arrays before Sorting:"+Arrays.toString(a));
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
		System.out.println("Arrays After Sorting:"+Arrays.toString(a));
	}

}
