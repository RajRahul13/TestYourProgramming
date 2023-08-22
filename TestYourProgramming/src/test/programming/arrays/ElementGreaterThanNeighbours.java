package test.programming.arrays;

public class ElementGreaterThanNeighbours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,7,6};
		// System.out.println(arr.length);
		try {
			for(int i=0;i<arr.length;i++){
				for(int j=i+1;j<arr.length-1;j++){
					if(arr[i]<arr[j] && arr[i+2]<arr[j]){
						System.out.println(arr[j]);
					}
				}
			}
		}catch (Exception e){
			System.out.println(e);
		}
	}

}
