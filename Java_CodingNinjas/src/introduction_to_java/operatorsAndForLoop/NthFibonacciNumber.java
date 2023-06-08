package introduction_to_java.operatorsAndForLoop;

import java.util.Scanner;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int firstTerm=0,secondTerm=1;
		for(int i=1;i<=n;i++) {
			int sum=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=sum;
			
			
		}
		System.out.println(firstTerm);

	}

}
