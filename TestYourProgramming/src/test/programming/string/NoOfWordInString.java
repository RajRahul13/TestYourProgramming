package test.programming.string;

public class NoOfWordInString {
//fix first method
	public static void main(String[] args) {
		String given = "This   is a    demo  String";
		given = given.trim();
		int count = 0;
		for (int i=0;i<given.length();i++) {
			if(given.charAt(i)==' '&& given.charAt(i+1)!=' ' ) {
					count++;			
				}
				else if (given.charAt(i)==' ' && given.charAt(i++)==' ') //if there is more than one space 
				{
					i++;
				}
				else if (i==given.length()-1) //matching first missing word
				{
					count++;
				}
		}
		
		//another method
		String [] stringArr = given.split("\\s+"); //splitting on basis of spaces
		int res = stringArr.length;
		
		
		//output
		System.out.println("No of words in given string :"+( count));
		System.out.println("Using another method :"+res);
	}

}
