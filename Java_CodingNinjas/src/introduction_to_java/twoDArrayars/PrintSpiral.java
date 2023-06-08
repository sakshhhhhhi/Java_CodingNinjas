package introduction_to_java.twoDArrayars;

import java.util.Scanner;

public class PrintSpiral {
	
	public static void spiralPrint(int matrix[][]){
		int minr=0;
		int maxr=matrix.length-1;
		int minc=0;
		int maxc=matrix[0].length-1;
		int totalElements= matrix.length*matrix[0].length;
		int Count=0;
		while(Count<totalElements) {
			//left wall
			for(int i=minr,j=minc;i<=maxr&& Count<totalElements;i++) {
				System.out.println(matrix[i][j]);
				Count++;
			}
			minc++;
			//bottom wall
			for(int i=maxr,j=minc ;j<=maxc && Count<totalElements;j++) {
				System.out.println(matrix[i][j]);
				Count++;
			}
			maxr--;
			//right wall
			for(int i=maxr,j=maxc;i>=minr && Count<totalElements;i--) {
				System.out.println(matrix[i][j]);
				Count++;
			}
			maxc--;
			//top wall
			for(int i=minr,j=maxc;j<=minc&& Count<totalElements;j--) {
				System.out.println(matrix[i][j]);
				Count++;
			}
			minr++;
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
		spiralPrint(arr);

	}

}
