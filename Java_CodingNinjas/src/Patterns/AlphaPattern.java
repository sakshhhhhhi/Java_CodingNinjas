package Patterns;

import java.util.Scanner;

public class AlphaPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int i =1;
		while(i<=n) {
			int j =1;
			while(j<=i) {
				char ithChar = (char)('A'+i-1);
				System.out.print(ithChar);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
