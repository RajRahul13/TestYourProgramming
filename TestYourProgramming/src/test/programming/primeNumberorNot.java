package test.programming;

public class primeNumberorNot {

	public static void main(String[] args) {
		//num > 1
		//which has only 2 factor 1 and itself
		int num =4;
		int count=0;
		if (num>1) {
			for(int i=1;i<=num;i++)
			{
				if(num%i==0) {
					count++;
				}
			}
		}
		if(count==2) {
			System.out.println("prime"+num);
		}else {
			System.out.println("not prime"+num);
		}
		
	}

}
