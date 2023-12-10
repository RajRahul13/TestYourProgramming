package test.programming.string;
import java.util.Scanner;

public class LowerAndUpper {

	public static void main(String[] args) {
		String temp;
	    Scanner sc = new Scanner(System.in);
	    temp = sc.nextLine();
	    char[] str = temp.toCharArray();
	    
	    //Write your code here
	    String str1="";
	    for(int i=0;i<str.length;i++){
	        if (str[i] >= 'A' && str[i] <= 'Z'){
	            str[i] += 32;
	        }else if(str[i] >= 'a' || str[i] <= 'z'){
	        	str[i] -=32;
	        }
	        str1 = str1+str[i];
	    }
	    System.out.println(str1);
	}

}
