package introduction_to_java.twoDArrayars;

import java.util.Scanner;

public class PrintLikeAWave {
	public static void wavePrint(int mat[][]){
		
		if(mat.length==0) {
			return;
		}
		for(int i =0;i<mat[0].length;i++) {
			if(i%2==0) {
				for(int j=0;j<mat.length;j++) {
					System.out.print(mat[j][i]+" ");
				}
			}
			else if(i%2!=0) {
				for(int j =mat.length-1;j>=0;j--) {
				System.out.print(mat[j][i]+" ");
			}
		}
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
		wavePrint(arr);

	}

}
