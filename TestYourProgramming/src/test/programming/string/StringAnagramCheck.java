package test.programming.string;

import java.util.Arrays;

public class StringAnagramCheck {

	public static void main(String[] args) {
	System.out.println( StringAnagramCheck1("Army","Mary"));
	} 
	
	public static Boolean StringAnagramCheck1(String str1, String str2) {
		char [] char1 = str1.toLowerCase().toCharArray();
		char [] char2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		str1 = Arrays.toString(char1);
		str2= Arrays.toString(char2);
		
		System.out.println(String.valueOf(char1)+String.valueOf(char2));
		return str1.equals(str2);
	}

}
