package Patterns;

import java.util.Scanner;

public class IsoscelesTriangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		while(i<=n) {
			
			int spaces=1;
			while(spaces<=n-i+1) {
				System.out.print(" ");
				spaces++;
			}
			int num =1;
			while(num<=i) {
			System.out.print(num);
			num++;
		    }
			int dec=i-1;
			while(dec>=1) {
				System.out.print(dec);
				dec--;
			}
			System.out.println();
			i++;
		}
	}

}
