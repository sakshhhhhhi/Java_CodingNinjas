package data_structures_in_Java.Graphs1;
import java.util.Scanner;
public class AdjacencyMatrixImplementation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int e = sc.nextInt();
		int adj[][] = new int [n][n];
		for(int i =0;i<e;i++) {
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			adj[v1][v2] = 1;
			adj[v2][v1] = 1;
		}
		for(int i =0;i<n;i++) {
			for(int j =0;j<n;j++) {
				System.out.print(adj[i][j]+" ");
			}
			System.out.println();
		}
	}

}
