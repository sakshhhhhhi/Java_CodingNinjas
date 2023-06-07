package twoDArrayars;

import java.util.Scanner;

public class TotalSumontheBoundariesandDiagonals {
	public static void totalSum(int[][] mat) {
		int sum=0;
		for(int i =0;i<mat.length;i++) {
			for(int j =0;j<mat[i].length;j++) {
				if(i==j||i+j==mat.length-1) {
					sum+=mat[i][j];
				}
				else if(i==0||i==mat.length-1||j==0||j==mat.length-1) {
					sum+=mat[i][j];
				}
			}
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r= sc.nextInt();
		int c=sc.nextInt();
		int [][]arr= new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j =0;j<c;j++) {
				arr[i][j]=sc.nextInt();
				}
		}
		totalSum(arr);

	}

}
