package commonPrograms;
import java.util.*;

public class duplicateCharacters {

	public static void main(String[] args) {
		String given = "AaaBbbbbbbccccc";
		
		char [] givenCharArr = given.toLowerCase().toCharArray();
		Map <Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c:givenCharArr) {
			if(!(map.containsKey(c))) {
				map.put(c, 1);
			}else {
				int count = map.get(c);
				map.put(c, count+1);
			}
		}
		System.out.println(map);
		System.out.print("Duplicates:\n");
		for(Map.Entry<Character,Integer> m : map.entrySet()) {
			if(m.getValue()>1) {
				System.out.print(m.getKey());
			}
		}

	}

}
