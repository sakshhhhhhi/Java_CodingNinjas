package data_structures_in_Java.Graphs3;

import java.util.Scanner;

public class AllPath {
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
        int src =s.nextInt();
        int dest=s.nextInt();
        String path ="";
        PrintAllPath(graph,src,dest,path);

	}

	private static void PrintAllPath(int[][] graph, int src, int dest, String path) {
		if(src==dest) {
			System.out.println(path+dest);
			return;
		}
		for(int i =0;i<graph.length;i++) {
			if(graph[src][i]==1) {
				PrintAllPath(graph,i,dest,path+src);
			}
		}
		
		
	}
	

}
