package test.programming.string;

public class StringPalindrome {

	public static void main(String[] args) {
		String str1= "rar";
		String rev = "";
		for(int i=str1.length()-1;i>=0;i--) {
			rev = rev+str1.charAt(i);
		}
		
		if(rev.equals(str1))
		{
			System.out.println("Palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
