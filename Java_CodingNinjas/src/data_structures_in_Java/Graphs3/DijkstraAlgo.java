package data_structures_in_Java.Graphs3;
import java.util.ArrayList;
import java.util.PriorityQueue;
import data_structures_in_Java.Graphs3.Edges.Edge;



public class DijkstraAlgo {
	public static void createGraph(ArrayList<Edge> graph[]) {
		for(int i =0;i<graph.length;i++) {
			graph[i] = new ArrayList<>();
			
		}
		graph[0].add(new Edge(0,1,2));
		graph[0].add(new Edge(0,2,4));
		graph[1].add(new Edge(1,3,7));
		graph[1].add(new Edge(1,2,1));
		graph[2].add(new Edge(2,4,3));
		graph[3].add(new Edge(3,5,1));
		graph[4].add(new Edge(4,3,2));
		graph[4].add(new Edge(4,5,5));
	}
	
	public static void dijkstra(ArrayList<Edge> graph[],int src) {
		
		int dis[] = new int[graph.length];
		for(int i =0;i<graph.length;i++) {
			if(i!=src) {
				dis[i] = Integer.MAX_VALUE;
			}
		}
		
		boolean vis[] = new boolean[graph.length];
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		pq.add(new Pair(src,dis[src]));
		while(!pq.isEmpty()) {
			Pair curr =pq.remove();
			if(!vis[curr.n])
			{
				vis[curr.n]=true;
				for(int i =0;i<graph[curr.n].size();i++) {
					Edge e =graph[curr.n].get(i);
					int u =e.src;
					int v = e.neighbour;
					int wt =e.weight;
					
					if(dis[u]+wt<dis[v]) {
						dis[v] = dis[u]+wt;
						pq.add(new Pair(v,dis[v]));
					}
				}
				
				}
			}
		for(int i =0;i<dis.length;i++) {
			System.out.print(dis[i]+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 6;
		ArrayList<Edge> graph[] = new ArrayList[V];
		createGraph(graph);
		int src =0;
		dijkstra(graph,src);
		

	}

}
