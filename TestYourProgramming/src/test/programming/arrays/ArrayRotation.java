package test.programming.arrays;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,10,15,20};
		System.out.println(Arrays.toString(arr));
		//rotate by 1

		    for(int j=2;j<arr.length;j++){
		    int temp = arr[0];
		    for (int i = 0; i < arr.length-1; i++){
		        arr[i]=arr[i+1];
		        arr[i+1]= temp;
		    }
	    }
		    System.out.println(Arrays.toString(arr));
		}
		
	
}

