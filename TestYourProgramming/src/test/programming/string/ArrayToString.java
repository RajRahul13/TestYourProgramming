package test.programming.string;

import java.util.Arrays;

public class ArrayToString {
	static int arr [] = new int[5];
	public static void main(String [] args) {
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i;
		}
		
		System.out.println(ArrayToStringUsingArraysToStringMethod());
		System.out.println(StringToArrayUsingStringBuilder());
		
	}
	
	public static String ArrayToStringUsingArraysToStringMethod() {
		String res = Arrays.toString(arr);
		return res;
	}
	public static String StringToArrayUsingStringBuilder() {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr.length;i++)
		{
			sb.append(arr[i]);
		}
		return sb.toString();	
	}
//	public static String usingJoinMethod() {
//		String Str1=String.join("",arr);
//	}
	

}
