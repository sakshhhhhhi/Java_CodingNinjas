package BasicsofJava;

import java.util.Scanner;
import java.lang.Math;
public class PowerOfaNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int c= (int)Math.pow(x,n);
			System.out.println(c);
	}

}
