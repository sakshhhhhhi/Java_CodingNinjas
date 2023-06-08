package introduction_to_java.Patterns;

import java.util.Scanner;

public class CharacterPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int i =1;
		while(i<=n) {
			int j =1;
			char ithChar = (char)('A'+i-1);
			while(j<=i) {
				
				System.out.print(ithChar);
				ithChar++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
