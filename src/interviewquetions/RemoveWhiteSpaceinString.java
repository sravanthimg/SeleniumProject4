package interviewquetions;

public class RemoveWhiteSpaceinString {

	public static void main(String[] args) {
		String str="Java $Programming Selenium Automation";
		System.out.println("Before removing the white spaces: "+str);
		str=str.replaceAll("\\W","");
		System.out.println("After removing the white spaces: "+str);

	}

}
