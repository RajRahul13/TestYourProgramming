package test.programming.string;

public class SwapString {
	public static void main(String[] args) {
		String str1 = "rahul";
		String str2="raj";
		System.out.println(str1+str2);
		str1=str1+str2; //step1
		
		/*
		 * System.out.println(str1.length()); System.out.println(str2.length());
		 */
		
		str2=str1.substring(0,(str1.length()-str2.length())); //step2
		
		str1=str1.substring(str2.length()); //step3
		
		System.out.println(str1);
		System.out.println(str2);
	}
}
