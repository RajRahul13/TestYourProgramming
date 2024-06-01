package commonPrograms;

public class maxAndMinOfArray {

	public static void main(String[] args) {
		int [] givenArr = {4,5,1,3,6};
		
		for(int i=0;i<givenArr.length-1;i++) {
			for(int j=0;j<givenArr.length-1;j++) {
				if(givenArr[j]>givenArr[j+1]) {
					int temp = givenArr[j];
					givenArr[j]=givenArr[j+1];
					givenArr[j+1]=temp;
				}
			}
		}
		
		System.out.println("Max: "+givenArr[givenArr.length-1]+"\n"+"Min: "+givenArr[0]);

	}

}
