package data_structures_in_Java.Recursion2;

import java.util.Scanner;

public class ReplaceCharactersRecursively {
	public static String replaceCharacter(String input, char c1, char c2) {
		String str="";
		for(int i=0;i<input.length();i++) {
		if(input.charAt(i)==c1) {
			str+=c2;
		}
		else {
			str+=input.charAt(i);
		}
		}
		return str;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		char c1=sc.next().charAt(0);
		char c2=sc.next().charAt(0);
		System.out.print(replaceCharacter(s,c1,c2));

	}

}
