package commonPrograms;
import java.util.*;

public class commonBtwArrays {
	public static List <Integer> lsAll = new ArrayList<Integer>();
	public static int count=0;
	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {1,2,4,3};
		int [] arr3 = {1,2,3};
		
		arrayToList(arr1);
		arrayToList(arr2);
		arrayToList(arr3);
		
//		List <Integer> ls = new ArrayList<Integer>();
//		ls.addAll(lsAll);
		
		Map <Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i:lsAll) {
			if(!(map.containsKey(i))) {
				map.put(i,1);
			}else {
				int count = map.get(i);
				map.put(i, count+1);
			}	
		}
		System.out.print("Common elements : \n");
		for(Map.Entry<Integer,Integer> m : map.entrySet()) {
			if(m.getValue()==count) {
				System.out.println(m.getKey());
			}
		} 
	}
	public static List<Integer> arrayToList(int [] givenArr) {
		for (int i=0;i<givenArr.length;i++) {
			lsAll.add(givenArr[i]);
		}
		count++;
		return lsAll;
	}

}
