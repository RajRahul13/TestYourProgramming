package collectionsPractice;

import java.util.*;


public class multipleValuesFromanotherList {
	
	static List<String> ls1 = new ArrayList<String>();
	static List<String> ls2 = new ArrayList<String>();
	
	static Map<String,List<String>> multimap = new HashMap<>();
	public static void main(String[] args) {
		
		ls1.add("INDIA");
		ls1.add("USA");
		
		ls2.add("DELHI");
		ls2.add("MUMBAI");
	
		multimap.put(ls1.get(0),ls2);
		
		for(Map.Entry<String,List<String>> hm:multimap.entrySet()) {
			if(hm.getKey().equalsIgnoreCase("India")) {
				System.out.println(hm.getValue());
			}
		}
		
	//	System.out.println(multimap);
		
	//	System.out.println(returnCity("INDIA"));
		
	
	}
	public static String returnCity (String Country) {
		switch(Country) {
		case("INDIA"):
		return ls2.get(0);
		case("USA"):
			return "NEWJERSEY,HOLLYWOOD";
		default:
			return null;
		}
		
	}
	
}
