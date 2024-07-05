package test.programming.string;

public class CountOccuranceOfCharacter {

	public static void main(String[] args) {
		System.out.println(countOccurance("ralahrll",'l'));
	}
	public static int countOccurance(String givenString, char givenChar) {
		int count=0;
		for(int i =0;i<givenString.length();i++) {
			if(givenString.charAt(i)==givenChar) {
				count++;
				
			}
		}
		return count;
		
	}

}
