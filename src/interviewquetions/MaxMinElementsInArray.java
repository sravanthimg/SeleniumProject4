package interviewquetions;

public class MaxMinElementsInArray {

	public static void main(String[] args) {
		int a[]= {50,100,20,40,10};
		
		int max=a[0];//50
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)//100>50//20>10040>100
			{
				max=a[i];//100
			}
		}
		System.out.println("Maximum Element in Array: "+max);
		
		int min=a[0];//50
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)//100<50//20<50//40<20//10<20
			{
				min=a[i];//20//10
			}
		}
		System.out.println("Minimum Elements in Array: "+min);
	}

}
