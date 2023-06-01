package operatorsAndForLoop;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0) {
			System.out.print("0");
		}
		int binary[]= new int[40];
		int index=0;
		while(n>0) {
			binary[index++]=n%2;
			n=n/2;
		}
		for(int i=index-1;i>=0;i--) {
			System.out.print(binary[i]);
		}

	}

}
