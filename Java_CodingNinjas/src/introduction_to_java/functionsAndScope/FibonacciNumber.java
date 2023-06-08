package introduction_to_java.functionsAndScope;

import java.util.Scanner;

public class FibonacciNumber {
		

	public static void main(String[] args) {
//		checkMember(8);
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int a=0,b=1,temp2=0;
		while((a+b)<=n) {
			int temp21=a+b;
			a=b;
			b=temp21;
			temp2=temp21;
		}
			if(n==temp2) {
				System.out.println("true"); 
			}
			else {
				System.out.println("false"); 
			}
		}
		
		
	}

	


