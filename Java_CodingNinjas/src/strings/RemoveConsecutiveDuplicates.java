package strings;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	public static String removeDuplicates(String str) {
		String ans="";
		ans+=str.charAt(0);
		for(int i =1;i<str.length();i++) {
			if(ans.charAt(ans.length()-1)!=str.charAt(i)) {
				ans+=str.charAt(i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print(removeDuplicates(str));

	}

}
