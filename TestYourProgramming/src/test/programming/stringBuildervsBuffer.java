package test.programming;

import java.util.ArrayList;
import java.util.List;

public class stringBuildervsBuffer {
	
	public static void main (String [] args) {
		StringBuilder sb = new StringBuilder(); // not threadsafe so fast
	//	StringBuffer sb = new StringBuffer(); // threadsafe slower than builder
		
		Thread thread1 = new Thread(() -> {
			for(int i=0;i<1000;i++) {
				sb.append("A");
			}
		});
		
		Thread thread2 = new Thread(() -> {
			for(int i=0;i<1000;i++) {
				sb.append("B");
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("Result (String Builder):"+ sb.toString().length());
	//	System.out.println("Result (String Buffer):"+ sb.toString().length());
		int i=10;
		Integer I = new Integer(i);
		
		int m= I.intValue();
		System.out.println(I +""+ m);
		
		List<Integer> l1 = new ArrayList<Integer>(); 
		 l1.add(0, 1); 
	        l1.add(1, 5);  
		  System.out.println(l1+" "+l1.get(1)); 
		} 
}
