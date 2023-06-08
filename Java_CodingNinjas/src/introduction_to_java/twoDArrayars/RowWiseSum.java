package introduction_to_java.twoDArrayars;

import java.util.Scanner;

public class RowWiseSum {
	public static void rowWiseSum(int[][] mat) {
		for(int i =0;i<mat.length;i++) {
			int rSum=0;
			for(int j=0;j<mat[i].length;j++) {
				rSum+=mat[i][j];
			}
		System.out.print(rSum + " ");
		}
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
		rowWiseSum(arr);

	}

}
