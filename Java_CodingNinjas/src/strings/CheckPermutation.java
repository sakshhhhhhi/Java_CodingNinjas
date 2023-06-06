package strings;

import java.util.Scanner;

public class CheckPermutation {
	public static boolean isPermutation(String str1, String str2) {
		int sum1=0;
	       int sum2=0;
	       if(str1.length()!=str2.length())
	           return false;
	       
	       if(!str2.contains(str1.substring(0,1)))
	           return false;
	       for(int i=0;i<str1.length();i++){
	           sum1+=str1.charAt(i);
	       }
	       for(int i=0;i<str2.length();i++){
	           sum2+=str2.charAt(i);
	       }
	       if(sum1==sum2)
	           return true;
	       else
	           return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.print(isPermutation(str1,str2));

	}

}
