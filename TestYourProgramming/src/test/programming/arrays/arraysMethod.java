package test.programming.arrays;

import java.util.Arrays;

public class arraysMethod {

		  public static void main(String[] args) {
				String str = " xyz123 abc ";
		        str = str.trim();
		    str = str.replaceAll("\\d+","");
		   // str = str.replaceAll("\\s+","");
		       	
		    //    char [] chararr = str.toCharArray();
		   //     System.out.println(chararr.length);
		   
		   String [] strarr = str.split("\\s+");
		   String newstr = Arrays.toString(strarr);
		   System.out.println(newstr);
		        
		  
		  }
		}