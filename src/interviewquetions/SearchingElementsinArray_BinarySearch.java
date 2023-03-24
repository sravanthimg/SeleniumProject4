package interviewquetions;

import java.util.Arrays;

public class SearchingElementsinArray_BinarySearch {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80,90,100};//should be in sorted order
		/*boolean flag=false;
		int key=10;
		int l=0;
		int h=a.length-1;
		
		while(l<=h)
		{
			int m=(l+h)/2;
			if(a[m]==key)
			{
				System.out.println("Element found");
				flag=true;
				break;
			}
			if(a[m]<key)
			{
				l=m+1;
			}
			if(a[m]>key)
			{
				h=m-1;
			}
		}
		if(flag==false)
		{
			System.out.println("Element Not Found");
		}*/
		
		//Approach2: Arrays:binarysearch()
		
		System.out.println(Arrays.binarySearch(a, 100));
	}

}
