package data_structures_in_Java.Recursion2;

import java.util.Scanner;

public class RemoveDuplicatesRecursively {
	public static String removeConsecutiveDuplicates(String s) {
	String str="";
	if(s.length()==1){
		str =s;
		return str;
	}
	String small=removeConsecutiveDuplicates(s.substring(0,s.length()-1));
	if (s.charAt(s.length() - 1) == small.charAt(small.length() - 1)) {
		return small;
	}
	small += Character.toString(s.charAt(s.length() - 1));
	return small;

}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		System.out.print(removeConsecutiveDuplicates(s));

	}

}
