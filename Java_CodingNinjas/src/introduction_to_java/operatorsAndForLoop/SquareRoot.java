package introduction_to_java.operatorsAndForLoop;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int res;
		res=(int) Math.pow(n,0.5);
		System.out.println(res);

	}

}
