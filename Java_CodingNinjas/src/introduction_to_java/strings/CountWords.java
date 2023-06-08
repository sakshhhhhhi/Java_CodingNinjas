package introduction_to_java.strings;

import java.util.Scanner;

public class CountWords {
	public static int count(String str) {
		if(str.length()==0) {
			return 0;
		}
		else {
			int NoOfWords=1;
			for(int i =0;i<str.length();i++) {
				if(str.charAt(i)==' ') {
					NoOfWords++;
				}
			}
			return NoOfWords;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print(count(str));
		

	}

}
