package strings;

import java.util.Scanner;

public class ReverseEachWord {
	public static String reverseEachWord(String input) {
		String[] arr = input.split(" ");
        for(int i=0; i<arr.length;i++){
            String s = "";
            String word = arr[i];
            for(int j=word.length()-1; j>=0; j--){
                s += word.charAt(j);
            }
            arr[i]=s;
        }
        String ans = "";
        for(int k=0; k<arr.length; k++){
            ans += arr[k]+" ";
        }
        return ans;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print(reverseEachWord(str));

	}

}
