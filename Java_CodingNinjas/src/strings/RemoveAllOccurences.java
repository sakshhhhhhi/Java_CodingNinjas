package strings;

import java.util.Scanner;

public class RemoveAllOccurences {
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		String[]str1=str.split(String.valueOf(ch));
		String ans="";
		for(int i=0;i<str1.length;i++) {
			ans+=str1[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch='a';
		System.out.print(removeAllOccurrencesOfChar(str,  ch));


	}

}
