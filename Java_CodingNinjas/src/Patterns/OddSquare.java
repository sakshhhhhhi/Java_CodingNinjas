package Patterns;

import java.util.Scanner;

public class OddSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		while(i<=n) {
			int j =n;
			int odd = 2*i-1;
			while(j>=i) {
				System.out.print(odd);
				odd+=2;
				j--;
			}
			j=1;
			int p =1;
			while(j<=i-1) {
				System.out.print(p);
				p+=2;
				j++;
			}
			System.out.println();
			i++;
		}


	}

}
