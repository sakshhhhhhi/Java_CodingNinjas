package operatorsAndForLoop;

import java.util.Scanner;

public class SumorProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int sum=0;
		int prod=1;
		if(c==1) {
			for(int i=1;i<=n;i++) {
				
				sum+=i;
			}
		System.out.println(sum);
		}
		else if(c==2) {
			for(int i=1;i<=n;i++) {
			
				prod*=i;
			}
		System.out.println(prod);
		}
		else {
			System.out.println("-1");
		}
	}

}
