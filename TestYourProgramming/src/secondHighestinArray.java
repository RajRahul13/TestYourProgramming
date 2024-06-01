
public class secondHighestinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {105,32,56,78,105};
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num>first) {
				second = first; //3
				first= num;	//4
			}else if(num>second && num!=first) {
				second=num; //4
			}
		}
		System.out.println(second);
		
	}

}
