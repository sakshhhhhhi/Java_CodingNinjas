package data_structures_in_Java.Graphs1;
import java.util.Scanner;

public class HasPath {
	public static boolean hasPath(int [][]graph, int src,int dest, boolean []vis){
		if(src ==dest) {
			return true;
		}
		vis[src] =true;
		for(int i =0;i<graph.length;i++) {
			if(!vis[i] && hasPath(graph,i,dest,vis) && graph[src][i]==1) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int n =sc.nextInt();
		 int e =sc.nextInt();
		 int graph[][] = new int[n][n];
		 for(int i =0;i<e;i++){
			 int v1 =sc.nextInt();
			 int v2=sc.nextInt();
			 graph[v1][v2]=1;
			 graph[v2][v1]=1;
		 }
		 int src =sc.nextInt();
		 int dest = sc.nextInt();
		 boolean vis[] = new boolean[graph.length];
		 System.out.println(hasPath(graph, src,dest, vis));

	}

}
