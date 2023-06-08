package introduction_to_java.strings;

import java.util.Scanner;

public class AllSubstrings {
	public static void printSubstring(String str) {
		for(int i =0;i<str.length();i++) {
			for(int j =i;j<str.length();j++) {
				System.out.println(str.substring(i,j+1));
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		printSubstring(str);

	}

}
