package data_structures_in_Java.Graphs1;
import java.util.*;
public class GetPathDFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int e = s.nextInt();
        int graph[][]=new int[n][n];
        for(int i=0;i<e;i++){
            int sv=s.nextInt();
            int ev=s.nextInt();
            graph[sv][ev]=1;
            graph[ev][sv]=1;
        }
		int src =s.nextInt();
		int dest =s.nextInt();
		boolean vis[] = new boolean[n];
		ArrayList<Integer> ans = GetPath(graph,src,dest,vis);
		if(ans!=null){
			for(int ele: ans){
				System.out.print(ele+" ");
			}
		}

	}

	private static ArrayList<Integer> GetPath(int[][] graph, int src, int dest, boolean[] vis) {
		// TODO Auto-generated method stub
		if(src==dest) {
			ArrayList<Integer> a = new ArrayList<>();
			vis[src]=true;
			a.add(src);
			return a;
		}
		vis[src]=true;
		for(int i =0;i<graph.length;i++) {
			if(!vis[i] && graph[src][i]==1) {
				ArrayList<Integer> ans = GetPath(graph,i,dest,vis);
				if(ans!=null) {
					ans.add(src);
					return ans;
				}
				
				
			}
		}
		
		return null;
	}

}
