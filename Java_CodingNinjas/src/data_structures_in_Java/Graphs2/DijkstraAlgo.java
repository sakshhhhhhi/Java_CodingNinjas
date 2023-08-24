package data_structures_in_Java.Graphs2;

import java.util.Scanner;

public class DijkstraAlgo {
	public static void dijkstra(int graph[][]) {
		int n =graph.length;
		boolean vis[] = new boolean[n];
		int []dis =new int[n];
		dis[0] =0;
		for(int i =1;i<n;i++) {
			dis[i] =Integer.MAX_VALUE;
		}
		for(int i =0;i<n-1;i++) {
			int minVertex =findMinVertex(vis,dis);
			vis[minVertex]=true;
			for(int j =0;j<n;j++) {
				if(graph[minVertex][j]>0 && !vis[j] && graph[minVertex][j]<Integer.MAX_VALUE) {
					int newDist =dis[minVertex]+graph[minVertex][j];
					if(newDist<dis[j]) {
						dis[j] = newDist;
					}
				}
			}
		}
		for(int i =0;i<n;i++) {
			System.out.print(i+" ");
		}
	}

	private static int findMinVertex(boolean[] vis, int[] dis) {
		int minVertex =-1;
		for(int i =0;i<vis.length;i++) {
			if(!vis[i]&&(minVertex==-1||dis[i]<dis[minVertex])) {
				minVertex =i;
			}
		}
		return minVertex;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();
		if(n==0 && e==0) {
			return;
			
		}
        int graph[][]=new int[n][n];
        for(int i=0;i<e;i++){
            int fv=s.nextInt();
            int sv=s.nextInt();
            int wt =s.nextInt();
            graph[fv][sv]=wt;
        }
        dijkstra(graph);

	}

}
