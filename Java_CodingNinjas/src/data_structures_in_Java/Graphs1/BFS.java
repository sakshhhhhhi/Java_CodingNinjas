package data_structures_in_Java.Graphs1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.IOException;

public class BFS {
public static void bfs(int [][] graph){
	    Queue<Integer> q =new LinkedList<>();
	    boolean vis[] = new boolean[graph.length];
		vis[0] =true;
		q.add(0);
		
		while(!q.isEmpty()) {
			int node =q.poll();
			System.out.print(node+" ");
			for(int i =0;i<graph.length;i++) {
				if(graph[node][i]==1 &&!vis[i]) {
					q.add(i);
					vis[i]=true;
				}
			}
		}
		
	}


	public static void main(String[] args) throws NumberFormatException, IOException {
        
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int e =sc.nextInt();
		 int graph[][] = new int[n][n];
		 for(int i =0;i<e;i++){
				int v1 = sc.nextInt();
				int v2 = sc.nextInt();
				graph[v1][v2]=1;
				graph[v2][v1]=1;			 
		 }
		 for(int i =0;i<n;i++){
			 for(int j =0;j<n;j++){
				 System.out.print(graph[i][j]+" ");
			 }
			 System.out.println();
		 }
		 bfs(graph);
	}

}
