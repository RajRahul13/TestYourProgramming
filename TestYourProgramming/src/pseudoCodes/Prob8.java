package pseudoCodes;

public class Prob8 {
	private static int x=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun());  
		
		//in x++ we using post increment so function will return value 1 and then will increment it.
		//if ++x pre increment used so function will return value 2 i.e incrementing first than return.
	}
	static int fun() {
		return x++;
	}
	

}
