package data_structures_in_Java.Graphs3;

import java.util.Scanner;

public class CycleDetectionDirected {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
            graph[fv][sv]=1;
        }
        System.out.println(IsCycle(graph));

	}

	private static boolean IsCycle(int graph[][]) {
		boolean [] vis = new boolean[graph.length];
		boolean [] st = new boolean[graph.length];
		for(int i =0;i<graph.length;i++) {
			if(!vis[i]) {
				if(IsCycleHelp(graph,vis,st,i)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean IsCycleHelp(int[][] graph, boolean[] vis, boolean[] st, int curr) {
		// TODO Auto-generated method stub
		vis[curr]=true;
		st[curr]=true;
		for(int i =0;i<graph.length;i++) {
			if(graph[curr][i]==1) {
//				int neigh =i;
				if(st[i]) {
					return true;
				}
				if(!vis[i] && IsCycleHelp(graph,vis,st,i)) {
					return true;
					
				}
			}
		}
		st[curr] =false;
		return false;
	}

}
