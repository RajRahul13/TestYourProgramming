package test.programming;

public class countNoofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 012;
		int count=0;
		while(a!=0) {
			int temp = a%10;
			count++;
			a=a/10;
		
		}
		
		System.out.println(count);
	}

}
