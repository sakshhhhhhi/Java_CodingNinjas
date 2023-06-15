package data_structures_in_Java.Recursion2;

import java.util.Scanner;

public class RemoveX {
	public static  String removeX(String s, char C) {
		int n=s.length();
		String str="";
		for(int i =0;i<n;i++) {
			if(s.charAt(i)!=C){
				str+=s.charAt(i);
			}
		}
		return str;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		char c=sc.next().charAt(0);
		System.out.print(removeX(s,c));

	}

}
