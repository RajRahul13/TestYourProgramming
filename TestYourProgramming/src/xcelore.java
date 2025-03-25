import java.util.ArrayList;
import java.util.List;

public class xcelore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> ls = new ArrayList<>();
		
		ls.add("Rahul");
		ls.add("raj");
		
		for(String str:ls) {
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='j') {
					System.out.println(str);
				}
			}
		}
		
	}

}
