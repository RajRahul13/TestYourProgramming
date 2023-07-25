package test.programming;

public class ReverseandSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 123;
		int rev =0;
		int sum=0;
		for(rev=0;a!=0;a=a/10) {
			rev= rev*10+ a%10;
			sum=sum+a%10;
		}
		
		String str = "Rahul";
		String revstr = "";
		for(int i=str.length()-1;i>=0;i--) {
			revstr= revstr+str.charAt(i);
		} 
		
		StringBuffer sb = new StringBuffer(str);
		StringBuffer newstr = sb.append("rai");
		
		System.out.println(newstr.reverse());
		System.out.println(rev);
		System.out.println(sum);
		System.out.println(revstr);
	}
			
}
