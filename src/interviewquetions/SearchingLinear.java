package interviewquetions;

public class SearchingLinear {

	public static void main(String[] args) {
		int a[]= {10,40,30,50,60};
		boolean flag=false;
		int search_ele=50;
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
			if(search_ele==a[i])
			{
				System.out.println("Element found at:"+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}
	}

}
