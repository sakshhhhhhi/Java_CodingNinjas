package data_structures_in_Java.Graphs1;
import java.util.*;
public class GetPathBFS {
	public static void main(String[] args) {
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
		Queue<Integer> q = new LinkedList<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		q.add(src);
		vis[src]=true;
		int currVertex = q.poll();
		boolean pathFound =false;
		while(q.isEmpty()) {
			for(int i =0;i<graph.length;i++) {
				if(!vis[i] && graph[currVertex][i]==1) {
					q.add(i);
					vis[i] =true;
					map.put(i, currVertex);
					if(i==dest) {
						pathFound=true;
						break;
					}
				}
			}
		}
		if(pathFound) {
			ArrayList<Integer> path = new ArrayList<>();
			int currVert=dest;
			while(currVert!= -1) {
				path.add(dest);
				currVert =map.get(dest);
			}
		}
		return null;
	}
}
