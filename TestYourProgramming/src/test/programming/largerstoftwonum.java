package test.programming;

public class largerstoftwonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=800;
		int num2=1200;
		int num3=400;
		
		int largest=0;
		
		if(num1>num2) {
			largest = num1;
		}else {
			largest = num2;
		}
		
		if (largest > num3) {
			largest = largest;
		}else {
			largest=num3;
		}
		// 2nd method
		if(num1>num2 && num1>num3) {
			System.out.println(num1);
		}else if (num2>num1 && num2>num3){
			System.out.println(num2);
		}else {
			System.out.println(num3);
		}
		
		System.out.println(largest);
	}

}
