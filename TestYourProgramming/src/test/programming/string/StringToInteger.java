package test.programming.string;

public class StringToInteger {

	public static void main(String[] args) {
		String str = "3456";
		int strInt=Integer.parseInt(str);
		//or
		int strInt1 = Integer.valueOf(str);
		
		System.out.println(strInt +" "+ strInt1);

	}

}
