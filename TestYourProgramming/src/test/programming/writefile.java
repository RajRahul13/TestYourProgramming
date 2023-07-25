package test.programming;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writefile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw= new FileWriter("");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("first line");
		bw.write("Second line");
		
		System.out.println("Writing finished");
	}

}
