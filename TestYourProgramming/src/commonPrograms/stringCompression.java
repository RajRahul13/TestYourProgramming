package commonPrograms;
import java.util.*;

public class stringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbccccaddddd";
		String compress = "";
		char [] strarr = str.toLowerCase().toCharArray();
		
		Map <Character,Integer> hm = new HashMap<Character,Integer>();
		for(char ch : strarr) {
			if(!(hm.containsKey(ch))) {
				hm.put(ch, 1);
			}else {
				int count = hm.get(ch);
				hm.put(ch, count+1);
			}
		}
	
		for(Map.Entry<Character,Integer> m : hm.entrySet()) {
			compress=compress+m.getKey()+m.getValue();
		}
		System.out.println(compress);
	}

}
