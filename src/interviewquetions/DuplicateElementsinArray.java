package interviewquetions;

import java.util.HashSet;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		String a[]= {"java","c++","python","c","Java"};
		
		//Approach1
		boolean status=true;
		System.out.println("Duplicates found in Array");
		System.out.println();
		for(int i=0;i<a.length;i++)//5
		{
			
			for(int j=i+1;j<a.length;j++)//1//2//3//4
			{
				
				if(a[i]==a[j])//java==c++//java==python//java==c//java==java
				{
					System.out.println(a[i]);
					status=false;
				}
			}
		}
		if(status==true)
		{
			System.out.println("Duplicate Elements in Array not Found");
		}
		
		//Approach2 :HashSet
		/*String a[]= {"java","c++","python","c","java"};
		HashSet<String> langs=new HashSet<>();
		/*System.out.println(langs.add("Java"));
		System.out.println(langs.add("python"));
		System.out.println(langs.add("Java"));
		
		for(String l:langs)
		{
			System.out.println(l);
		}*/
		/*boolean flag=false;
		
		for(String l:a)
		{
			if(langs.add(l)==false);
			{
				System.out.println("Duplicates Elements in Array found: "+l);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicates Elements in Array not found");
		}*/
		

	}

}
