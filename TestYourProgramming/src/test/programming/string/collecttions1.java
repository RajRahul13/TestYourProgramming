package test.programming.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class collecttions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> country = new ArrayList<String>();
		
		List <String> cities = new ArrayList<String>();
		
		Map<String,String> map= new HashMap<String,String>();
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	
	}

}
