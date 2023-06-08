package introduction_to_java.Patterns;

import java.util.Scanner;

public class SumPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		while(i<=n) {
			int s =2;
			System.out.print(1);
			int j=1;
			while(j<i) {
				System.out.print("+"+s);
				s++;
				j++;
			}
			int sum=(i*i+i)/2;
			System.out.println("="+sum);
			i++;
		}

	}

}
