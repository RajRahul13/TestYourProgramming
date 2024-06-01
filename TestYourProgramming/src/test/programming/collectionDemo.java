package test.programming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class collectionDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int in =  sc.nextInt();
		
		
		List<String> al = new ArrayList<String>();
		al.add("Rahul");
		al.add("Saloni");
		al.add("raj");

		al.set(1, "demo");
		al.get(1);
		al.remove(2);

		for (String L : al) {
			System.out.println(L);
		}

		System.out.println(al.size());

		// al.clear();
		System.out.println(al);

		Set<Integer> S = new HashSet<Integer>();
		S.add(11);
		S.add(1);

		
		  for(int i=10;i>=0;i--) 
		  { 
			  S.add(i); 
			  }
		 
		Iterator<Integer> itr = S.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//newe
	}
}
