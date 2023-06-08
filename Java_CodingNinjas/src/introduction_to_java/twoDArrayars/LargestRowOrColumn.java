package introduction_to_java.twoDArrayars;

import java.util.Scanner;

public class LargestRowOrColumn {
	public static void findLargest(int input[][]) {
		if(input.length==0) {
			System.out.print("row"+" "+"0"+Integer.MIN_VALUE);
		}
		int sum=0, largestRow=Integer.MIN_VALUE,rn=0;
		for(int i =0;i<input.length;i++) {
			sum=0;
			for(int j =0;j<input[0].length;j++) {
				sum+=input[i][j];
			}
			if(sum>largestRow) {
				largestRow=sum;
				rn=i;
			}
		}
		int sum1=0, largestCol=Integer.MIN_VALUE,cn=0;
		for(int i =0;i<input[0].length;i++) {
			sum1=0;
			for(int j =0;j<input.length;j++) {
				sum1+=input[j][i];
			}
			if(sum>largestCol) {
				largestCol=sum1;
				cn=i;
			}
		}
		if (largestRow >= largestCol) {
			System.out.print("row " + rn + " " + largestRow);
		} else if (largestRow < largestCol) {
			System.out.print("column " + cn + " " + largestCol);

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
		findLargest(arr);

	}

}
