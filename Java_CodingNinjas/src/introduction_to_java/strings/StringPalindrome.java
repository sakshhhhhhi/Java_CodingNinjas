package introduction_to_java.strings;

import java.util.Scanner;

public class StringPalindrome {
	public static boolean isPalindrome(String str) {
		String rev="";
		for(int i =str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		if(rev.equals(str)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print(isPalindrome(str));

	}

}
