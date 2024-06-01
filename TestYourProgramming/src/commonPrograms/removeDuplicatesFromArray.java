package commonPrograms;
import java.util.*;

public class removeDuplicatesFromArray {

	public static void main(String[] args) {
		int [] arr = {1,1,2,2,3,3,3,4,5,4};
		
		Set <Integer> hs = new HashSet<Integer>();
		
		for(int i: arr) {
			hs.add(i);
		}
		
		System.out.println(hs);
	}

}
