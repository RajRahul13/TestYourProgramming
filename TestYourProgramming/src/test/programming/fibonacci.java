package test.programming;

public class fibonacci {

	public static void main(String[] args) {
		int num1=1 ,num2=1, next=0;
		System.out.print(0+" "+num1 +" "+num2);
		
		for(int i=0;i<=10;i++)
		{
			next=num1+num2;
			System.out.print(" "+next);
			num1=num2;
			num2=next;
		}
	}

}
