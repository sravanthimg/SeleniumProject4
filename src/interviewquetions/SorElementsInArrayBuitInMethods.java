package interviewquetions;

import java.util.Arrays;
import java.util.Collections;

public class SorElementsInArrayBuitInMethods {

	public static void main(String[] args) {
		//Approach1
		/*int a[]= {30,50,60,20,10};
		System.out.println("Arrays before Sorting: "+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Arrays After Sorting: "+Arrays.toString(a));*/
		
		//Approach2
		/*int a[]= {30,50,10,20,60};
		System.out.println("Arrays before Sorting: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Arrays After Sorting: "+Arrays.toString(a));*/
		
		//Approach3
		Integer a[]= {30,40,10,50,20};
		System.out.println("Arrays before Sorting: "+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Arrays after Sorting: "+Arrays.toString(a));
	}

}
