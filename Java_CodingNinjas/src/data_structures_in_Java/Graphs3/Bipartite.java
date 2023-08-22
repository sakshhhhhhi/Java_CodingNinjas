package data_structures_in_Java.Graphs3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bipartite {

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
            graph[sv][fv]=1;
        }
        System.out.println(IsBipartite(graph));

	}

	private static boolean IsBipartite(int[][] graph) {
		// TODO Auto-generated method stub
		int col[] = new int[graph.length];
		for(int i =0;i<col.length;i++) {
			col[i]=-1;
		}
		
		Queue<Integer> q = new LinkedList<>();
		for(int i =0;i<graph.length;i++) {
			if(col[i]==-1) {
			q.add(i);
			col[i]=0;
			while(!q.isEmpty()) {
				int curr=q.remove();
				for(int j=0;j<graph.length;j++) {
					if(graph[curr][j]==1) {
					int neigh = j;
					if(col[neigh]==-1) {
						int nextCol =col[curr] == 0 ? 1 : 0;
						col[neigh] =nextCol;
						q.add(neigh);
						
					}
					else if(col[neigh]==col[curr]) {
						return false;
					}
					}
				}
				
			}
		}
		
	}
		return true;
	}

}
