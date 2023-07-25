package test.programming;

import java.util.Random;

public class generateRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = Math.random();
		System.out.println(num);
		Random random = new Random();
		System.out.println(random.nextInt(100));
		
		
//		String randomstr = RandomStringUtils.randomAlphabetic(10);
//		System.out.println(randomstr);
	}

}
