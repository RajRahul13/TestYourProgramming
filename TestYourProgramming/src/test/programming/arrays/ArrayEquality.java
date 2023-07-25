package test.programming.arrays;

import java.util.Arrays;

public class ArrayEquality {

	public static void main(String[] args) {
		int arr1 [] = {1,3,3}; 
		int arr2 [] = {1,2,3}; 
		
		Boolean bool = Arrays.equals(arr1,arr2);
		System.out.println(bool);
		
		//2nd method
		boolean status=true;
		if(arr1.length==arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i])
					status = false;
			}
		}else
		{
			status=false;
		}
		if(status = true)
		{
			System.out.println("array equal");
		}
		else {
			System.out.println("array not equal");
		}
	}

}
