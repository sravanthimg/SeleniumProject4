package interviewquetions;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumbersAndString {

	public static void main(String[] args) {
		//Approach  1-Random
		Random rand=new Random();
		//int rand_int=rand.nextInt(10);
		//int rand_int=rand.nextInt(100);
		//int rand_int=rand.nextInt(1000);
		//System.out.println(rand_int);
		
//		double rand_dbl=rand.nextDouble();//range 0.0 and less than 1.0
//		System.out.println(rand_dbl);
		
		//Approach 2-Using Math class
		
		//System.out.println(Math.random());
		
		//Approach3-Apache commins-lang API
		//http://commons.apache.org/
		//String randNum=RandomStringUtils.randomNumeric(5);
		//String randNum=RandomStringUtils.randomNumeric(10);
		//System.out.println(randNum);
		String randstr=RandomStringUtils.randomAlphabetic(5);//Ramdom From A to Z
		System.out.println(randstr);
	}
	

}
