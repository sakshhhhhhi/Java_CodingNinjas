package introduction_to_java.strings;

import java.util.Scanner;

public class HighestOccuringChar {
	public static char highestOccuringChar(String str) {
		int[] charCounts = new int[256]; 
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCounts[c]++;
        }

        char highestChar = '\0';
        int highestCount = 0;

        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > highestCount) {
                highestCount = charCounts[i];
                highestChar = (char) i;
            }
        }

        return highestChar;
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print(highestOccuringChar(str));

	}

}
