package test.programming.string;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  str="My name is roshan";
        String rev="";
        
        //code
        String [] strarr = str.split(" ");
        for(int i=0;i<strarr.length ;i++){
            for(int j=strarr[i].length()-1;j>=0;j--){
                rev= rev + strarr[i].charAt(j);
            }
            rev = rev + " ";
        }
        System.out.println(rev);
	}

}


