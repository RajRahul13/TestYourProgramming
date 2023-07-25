package test.programming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readfile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file= new File("file locn");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
	}

}
