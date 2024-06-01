package commonPrograms;

public class MissingNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] givenArr = {1,2,3,4,6};
		int n = givenArr.length;
		
		int arrSum = 0;
		int sum = (n+1)*(n+2)/2;
		
		for(int i=0;i<givenArr.length;i++) {
			arrSum += givenArr[i];
		}
		
		System.out.println("Missing Number : "+ (sum-arrSum));
	}

}
