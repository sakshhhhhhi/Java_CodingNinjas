package data_structures_in_Java.Graphs3;

import java.util.Scanner;

public class CycleDetectionUndirected {
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
            graph[fv][sv]=1;
            graph[sv][fv]=1;
        }
        System.out.println(detectCycle(graph));
	}

	public static boolean detectCycle(int[][] graph) {
		// TODO Auto-generated method stub
		boolean vis[] = new boolean[graph.length];
		for(int i =0;i<graph.length;i++) {
			if(!vis[i]) {
				if(detectCyclehelp(graph,vis,i,-1)) {
					return true;
				}
		    }
		}
		return false;
		
	}

	public static boolean detectCyclehelp(int[][] graph, boolean[] vis, int curr, int parent) {
		vis[curr]=true;
		for(int i =0;i<graph.length;i++) {
			if (graph[curr][i] ==1) { 
	            if (!vis[i] ) {
	                if (detectCyclehelp(graph, vis, i, curr)) {
	                    return true;
	                }
	            } 
	            else if (vis[i] &&i != parent) {
	                return true;
	            }
        }
			
		}
		
		return false;
	}

}
