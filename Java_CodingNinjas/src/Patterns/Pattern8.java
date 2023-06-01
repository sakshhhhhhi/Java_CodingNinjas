package Patterns;
import java.util.*;
public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int i =1;
		while(i<=n) {
			int j =1;
			while(j<=n) {
				char jthChar = (char)('A'+j-1);
				System.out.print(jthChar);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
