package introduction_to_java.operatorsAndForLoop;

import java.util.Scanner;

public class ReverseOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int rev_no=0;
		while(n>0) {
			rev_no=rev_no*10+n%10;
			n=n/10;
		}
	    System.out.println(rev_no);
	}

}
