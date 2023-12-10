 package test.programming.string;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = {3,2,4,2,1};
		 
		 String strbfr = Arrays.toString(arr);
		    
		    for(int i =0; i<arr.length-1;i++)
		    {
		        for(int j=0;j<arr.length-1;j++){
		            if(arr[j]>arr[j+1]){
		                int temp = arr[j];
		                arr[j] = arr[j+1];
		                arr[j+1] = temp;
		            }
		        }
		    }
		    
		    String straftr = Arrays.toString(arr);
		    
		    System.out.println(straftr);
		    

	}

}

//Online Java Compiler
//Use this editor to write, compile and run your Java code online


