package test.programming;
import java.util.*;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you number:");
		int num = sc.nextInt();
//		System.out.println(num);
		checkArmstrong(num);
	}
	public static String checkArmstrong(int input) {
		int n=0;
		int sum=0;
		while( input!=0) {
			int temp = input%10;
			n++;
			input=input/10;
		}
		System.out.println("length :"+n);
		while(input!=0) {
			int temp1 = input%10;
			int exp=n;
			sum = (int) (sum + Math.pow(temp1,exp));
			input = input/10;
		}
		System.out.println(sum);
		
		if(sum==input) {
			return("Number is armsstrong");
		}else
			return("Number is not armsstrong");
	}

}
