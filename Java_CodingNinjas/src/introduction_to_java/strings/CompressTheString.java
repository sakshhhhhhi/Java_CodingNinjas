package introduction_to_java.strings;

import java.util.Scanner;

public class CompressTheString {
	public static String getCompressedString(String str) {
		int count=1;
		String ans=str.charAt(0)+"";
		for(int i=1;i<str.length();i++) {
			char curr=str.charAt(i);
			char prev=str.charAt(i-1);
			if(curr==prev) {
				count++;	
		}
			else {
				if(count>1) {
					ans+=count;
					count=1;
				}
				ans+=curr;
			}
		}
		if(count>1) {
			ans+=count;
			count=1;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print(getCompressedString(str));

	}

}
