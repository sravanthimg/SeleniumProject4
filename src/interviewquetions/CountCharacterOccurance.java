package interviewquetions;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		String s="Java Programming java Oops";
		int total=s.length(); //total length
		int count_replacementa=s.replaceAll("a", "").length();//total length after removing a's
		int count=total-count_replacementa;
		System.out.println("Number Occurence of a is: "+
		count);
		

	}

}
