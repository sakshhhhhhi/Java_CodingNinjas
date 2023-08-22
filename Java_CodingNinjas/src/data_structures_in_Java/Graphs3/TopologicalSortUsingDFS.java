package data_structures_in_Java.Graphs3;

import java.util.Scanner;
import java.util.Stack;

public class TopologicalSortUsingDFS {
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
        TopSort(graph);

	}

	private static void TopSort(int[][] graph) {
		// TODO Auto-generated method stub
		boolean []vis = new boolean[graph.length];
		Stack<Integer> st = new Stack<>();
		
		for(int i =0;i<graph.length;i++) {
			if(!vis[i]) {
				TopSortHelp(graph,vis,st,i);
			}
		}
		while(!st.isEmpty()) {
			System.out.print(st.pop()+" ");
		}
		
	}

	private static void TopSortHelp(int[][] graph, boolean[] vis, Stack<Integer> st, int curr) {
		// TODO Auto-generated method stub
		vis[curr] = true;
		for(int i = 0 ; i<graph.length ; i++) {
			if(graph[curr][i]==1) {
				if(!vis[i]) {
					TopSortHelp(graph,vis,st,i);
				}
			}
		}
		st.push(curr);
	}

}
