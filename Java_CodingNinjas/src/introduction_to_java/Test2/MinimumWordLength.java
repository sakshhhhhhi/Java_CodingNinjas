package introduction_to_java.Test2;

import java.util.Scanner;

public class MinimumWordLength {
	public static String minLengthWord(String input) {
		
		String minWord="";
        int prevSpace=0;
        input = " " + input + " ";
        for (int i=1;i<input.length();i++)
        {
            if (input.charAt(i) == ' ')
            {
                String word = input.substring(prevSpace+1,i);
                if (word.length() < minWord.length() || minWord.length() == 0)
                {
                    minWord=word;
                }
                prevSpace=i;
            }
        }
        return minWord;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(minLengthWord(str));


	}

}
