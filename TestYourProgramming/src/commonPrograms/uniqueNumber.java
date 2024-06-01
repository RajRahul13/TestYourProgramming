package commonPrograms;

import java.util.Scanner;

public class uniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n,r1,r2,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		n = sc.nextInt();

		n1=n;n2=n;
		while (n1>0) {
			r1=n1%10;
			while(n2>0) {
				r2 = n2%10;
				if(r1==r2) {
					c++;
				}
				n2=n2/10;
			}
			n1=n1/10;
		}
		
		if(c==1) {
			System.out.println("unique Number");
		}else
			System.out.println("Not unique Number");
	}

}
