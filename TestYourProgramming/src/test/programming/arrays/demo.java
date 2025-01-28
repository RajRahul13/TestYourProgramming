package test.programming.arrays;
import java.util.*;


public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1= new ArrayList();
		
		l1.add(3);
		l1.add(5);
		l1.add("raj");
		
		Iterator itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

