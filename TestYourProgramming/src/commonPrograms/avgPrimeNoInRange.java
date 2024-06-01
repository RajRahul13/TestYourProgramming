package commonPrograms;

public class avgPrimeNoInRange {
	static int totalNo=0;
	public static void main(String[] args) {
		float sum =0;
		for(float i=1;i<=7;i++) {
			if(checkPrime(i)==true) {
				sum = sum+i;
			}
		}
	float avg = (sum/totalNo);
		System.out.println("avg :"+ avg);
		
	}
	public static boolean checkPrime(float n) {
		int count=0;
		boolean prime=false;
		if(n>0) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		}
		if(count==2) {
			prime= true;
			totalNo++;
		}
		return prime;
	}

}
