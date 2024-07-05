package test.programming.string;

import java.util.Scanner;

public class StringConcatenate {
	
	public static void main(String[] args) {
	    String temp;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter First String : ");
	    temp = sc.nextLine();
	    char[] str1 = temp.toCharArray();
	    
	    System.out.print("Enter Second String : ");
	    temp = sc.nextLine();
	    char[] str2 = temp.toCharArray();

	    //Write your code here
	    String n1="";
	    String n2="";
	    for(int i =0;i<str1.length;i++){
	        n1 = n1 + str1[i];
	    }
	    for(int j =0;j<str2.length;j++){
	        n2 = n2 + str2[j];
	    }
	    String n3 = n1+n2;
	    System.out.println("Copied string ="+n3);
	}

	    
}
