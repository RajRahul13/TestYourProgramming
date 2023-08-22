import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import test.programming.string.ArrayToString;

public class practice {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String str1 = "ymra";
		String str2 = "army";
		int count =0;
		//method 1
	/*	for(int i=0;i<str1.length();i++)
		{
			for(int j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j)) 
				{
					count++;
				}
			}
		}

		if(count == str1.length()&& count == str2.length())
		{
			System.out.println("both string are anagram");
		}else
		{
			System.out.println("they are not anagram");
		}*/
		
		//method 2
		/*char [] char1= str1.toCharArray();
		char [] char2= str2.toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		str1 = Arrays.toString(char1);
		str2 = Arrays.toString(char2);
		
		if (str1.equals(str2))
		{
			System.out.println("anagram by 2nd method");
		}*/
	
		//Prime Number
		/*int num= 6;
		int count1 =0;
		
		//can divided by 1 and itself
		if(num!=0) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count1++;
			}
			}
		}
		if(count1 == 2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime");
		}*/
		
		//palindrome
		
		/*int num= 432;
		int rev = 0;
		for(int i=num; num >0;num=num/10) {
			rev = rev*10+num%10;
		}
		System.out.println(rev);
		
		String str3 = "rahul";
		String rev1 = "";
		for(int i=str3.length()-1;i>=0;i--)
		{
			rev1= rev1+str3.charAt(i);
		}
		System.out.println(rev1);
		*/
		
		/*int num = 23045;
		int temp =0;
		int countEven =0;
		int countOdd =0;
		int digitCount=0;
		while(num>0) {
			temp = num%10;
			digitCount++;
			if(temp%2==0 || temp==0) {
				countEven++;
			}else {
				countOdd++;
			}
			num =num/10;
		}
		System.out.println("Total no of didgit :"+digitCount);
		System.out.println("even count :"+countEven);
		System.out.println("odd count :"+countOdd);*/
		
	/*	//fibonacci no - 1,1,2,3,5,8,13,....
		int num1=1,num2=1;
		int next=0;
		System.out.print(num1+","+num2);
		for(int i=2;i<=8;i++) {
			next =num1+num2;
			System.out.print(","+next);
			num1=num2;
			num2=next;
		}*/
		
		/*System.out.println(Math.random());
		Random random = new Random();
		System.out.println(random.nextInt(100));*/
		
		/*File file = new File("C:\\Users\\M1053553\\Desktop\\ReadFile.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}*/
		
		/*int num= 324;
		int rev=0;
		int sum=0;
		while(num>0) {
			rev = rev*10 + num%10;
			sum = sum + num%10;
			num = num/10;
		}
		System.out.println("reverse digit :"+rev);
		System.out.println("sum :"+sum);*/
		
		/*int [] arr = new int [] {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];	
		}
		System.out.println(sum);*/	
		
		/*int num1=2;
		int num2=4;
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println(num1+" "+num2);*/
		
		int arr [] = new int [] {2,3,4,1,5};
		int temp,temp1;
		temp =arr[0];
		arr[0]=arr[4];
		arr[4]=temp;
		
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		System.out.println("After sorting :"+Arrays.toString(arr));
				
		
		
		
	}
}
