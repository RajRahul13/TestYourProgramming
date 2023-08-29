package test.programming.arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6}; //input array
		int n=2;  // no of rotation required
		arrayRotn(arr, n);
	}
	public static void arrayRotn(int arr[],int n) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int j=1;j<=n;j++) {
		int temp =arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
			arr[i+1]=temp;	
		}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
