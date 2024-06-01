package pseudoCodes;

public class Prob9 {

	int x=2;
	Prob9(int x){
		this.x=x;
	}
	Prob9(double i){
		x=(int)i;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prob9 obj1 = new Prob9(5);
		System.out.println(obj1.x);
		
		Prob9 obj2 = new Prob9(1.2);
		System.out.println(obj2.x);
	}

}
