package interviewquetions;

public class RemoveJunkSpecialCharsInString {

	public static void main(String[] args) {
		String s="@#$%&^(*&^!@@ hello World 1234567";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		String s1="@#!$!%!^!&!*!*!><?{}<~ Selenium !@$^~<>{}{}() HEloo";
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
	}

}
