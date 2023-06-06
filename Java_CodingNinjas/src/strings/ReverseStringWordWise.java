package strings;

import java.util.Scanner;

public class ReverseStringWordWise {
	public static String reverseWordWise(String input) {
		String[]res=input.split(" ");
        String rev="";
        for(int i=res.length-1;i>=0;i--){
            rev+=res[i];
            rev+=" ";
        }
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print(reverseWordWise(str));

	}

}
