package test.programming;

public class countEvenandOddinNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123456;
		int temp=0;
		int counteven=0;
		int countodd=0;
		while(num>0) {
			temp = num%10;
			if (temp % 2==0) {
				counteven++;
			}else if(temp%2!=0){
				countodd++;
			}
			num=num/10;  // dont forget
		}
		System.out.println(counteven);
		System.out.println(countodd);
		System.out.println("test");
	} 

}
