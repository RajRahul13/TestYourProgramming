package commonPrograms;
import java.util.*;

public class duplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given= "YOU YOU GOOD GOOD GOOD BOY";
		String [] givenArr = given.split("\\s+");
		
		Map <String,Integer> map = new HashMap<String,Integer>();
		
		for (String s:givenArr) {
			if (!(map.containsKey(s))) {
				map.put(s,1);
			}else {
				int count = map.get(s);
				map.put(s, count+1);
			}
		}
		//Set<Map.Entry<String,Integer>> s = map.entrySet();
		System.out.print("Duplicates :"+"\n");
		for(Map.Entry <String, Integer> m : map.entrySet()) {
			if(m.getValue()>1) {
				System.out.println(m.getKey());
			}
		}
	}

}
