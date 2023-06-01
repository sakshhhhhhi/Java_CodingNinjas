package Patterns;

import java.util.Scanner;

public class TriangleofNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		while(i<=n) {
			int spaces=1;
			while(spaces<=n-i) {
				System.out.print(" ");
				spaces++;
			}
			int j=1;
			int k =i;
			while(j<=i) {
				
			    System.out.print(k);
			    k++;
			    j++;
			    
			}
			k=k-2;
			int l =1;
			while(l<=i-1){
				System.out.print(k);
				k--;
				l++;
			 
				
			}
			System.out.println();
			i++;
			
			}

	}

}
