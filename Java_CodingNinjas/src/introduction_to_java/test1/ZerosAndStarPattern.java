package introduction_to_java.test1;

import java.util.Scanner;

public class ZerosAndStarPattern {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		for(int i =n;i>0;i--) {
//			for(int j=1;j<=n;j++) 
//				System.out.print("0");
//			System.out.print("*");
//			for(int j=i-1;j>0;j--) 
//				System.out.print("0");
//			System.out.print("*");
//			for(int j=i-1;j>0;j--)
//				System.out.print("0");
//			System.out.print("*");
//			for(int j=1;j<=n-i;j++) 
//				System.out.print("0");
//			System.out.println();
//		}
		Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        for(i=n;i>0;i--)
        {
            for(j=1;j<=n-i;j++)
                    System.out.print("0");
            System.out.print("*");
            for(j=i-1;j>0;j--)
                System.out.print("0");
            System.out.print("*");
            for(j=i-1;j>0;j--)
                System.out.print("0");
            System.out.print("*");
            for(j=1;j<=n-i;j++)
                System.out.print("0");
            System.out.println();
        }

	}

}
