package test.programming.string;

public class StringReverseWithSpacesFixed {

	public static void main(String[] args) {
		reverses("Hi My name is Rahul");
	}
	public static void reverses(String str){
		char [] input = str.toCharArray();
		char [] output = new char [input.length];

		for(int i=0;i<input.length;i++){
			if(input[i]==' '){
				output[i]= ' ';
			}
		}

		int j = output.length-1;
		for(int i=0;i<input.length;i++){
			if(input[i] !=' '){
				if(output[j]==' '){
					j--;
				}
				output[j] = input[i];
				j--;
			}

		}
		System.out.println(String.valueOf(output));

	}
}




