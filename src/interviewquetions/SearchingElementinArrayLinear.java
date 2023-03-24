package interviewquetions;

public class SearchingElementinArrayLinear {

	public static void main(String[] args) {
		int a[]= {10,50,40,30,20};
		int elemnt_li=10;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
			if(elemnt_li==a[i])
			{
				System.out.println("Element found: "+a[i]);
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
