package test.programming.string;

public class RmvGivenCharFromStr {

	public static void main(String[] args) {
		String givenStr="RARARARARA";
		String res="";
		char givenChar = 'R';
		
		char [] strArr = givenStr.toCharArray();
		
		for(int i=0;i<strArr.length;i++)
		{
			if(strArr[i]!=givenChar) {
				res=res+strArr[i];
			}
		}
		
		System.out.println("you string after removing "+givenChar+" is "+res);
		
		//anopther metod call
		System.out.println(another("RaRaRa",'R'));
		
		//using repalce method of string
		
		System.out.println(givenStr.replace("R",""));
	}
	
	//aother method
	public static String another(String input, char inputchar){
		String result="";
		for(int i=0;i<input.length();i++) {
			if(inputchar != input.charAt(i)) {
				result = result + input.charAt(i);
			}
		}
		return result;
	}
	

}
