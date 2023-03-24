package interviewquetions;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		//Approach1
		String str="Welcome To Java"; //original String
		String[] words=str.split(" "); //Splitting string into words
		
		String reverseString="";
		
		for(String w:words) //Welcome
		{
			String reverseWords="";
			for(int i=w.length()-1;i>=0;i--)//Welcome
			{
				reverseWords=reverseWords+w.charAt(i);//avaJ
			}
			reverseString=reverseString+reverseWords+" "; //emocleW+oT+" "+avaJ
		}
		System.out.println(reverseString);
		
		//Approach2
		
		/*String str="Welcome To Java";
		String[] words=str.split("\\s");
		
		String reverseword="";
		for(String w:words) //Welcome
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse(); //emocleW
			reverseword=reverseword+sb.toString()+" ";  //emocleW
			
		}
		System.out.println(reverseword);*/
		

	}

}
