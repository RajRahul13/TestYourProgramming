package test.programming.string;

public class RevWordsFromGivenString {

	public static void main(String[] args) {
		String str = " This is your    string    ";
		String res="";
		str =str.trim();
		
		String [] stringArr = str.split("\\s+"); //splitting on basis of spaces
		
		for(int i=0;i<stringArr.length;i++)
		{
			for(int j=stringArr[i].length()-1;j>=0;j--) //stringArr[i] will give word at ith posn of string
			{
				res = res+stringArr[i].charAt(j); //stringArr[i].charAt(j) will give char at jth position from the word stringArr[i]
			}
			res=res+' ';//adding spaces after reversing
		}
		
		System.out.println(res);
	}

}
