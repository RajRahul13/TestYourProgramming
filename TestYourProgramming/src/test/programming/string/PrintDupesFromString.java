package test.programming.string;
//fix this code
public class PrintDupesFromString {

	public static void main(String[] args) {
		String str = "abc";
		System.out.print("Duplicates character are :");
		for(int i=0;i<str.length();i++)
		{  
			for(int j=1;j<str.length();j++)
			{  
				if (str.charAt(i)==str.charAt(j))
				{
					System.out.print(str.charAt(j));
				}else {
					continue;
				}
			}
		}

	}

}
