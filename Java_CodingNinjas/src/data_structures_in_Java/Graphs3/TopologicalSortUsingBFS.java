package data_structures_in_Java.Graphs3;

import java.util.*;

import data_structures_in_Java.Graphs3.Edges.Edge;

public class TopologicalSortUsingBFS {
	
	public static void calcIndeg(ArrayList<Edge> graph[], int indeg[]) {
		for(int i =0;i<graph.length;i++) {
			for(int j =0;j<graph[i].size();i++) {
				Edge e = graph[i].get(j);
				indeg[e.neighbour]++;
			}
		}
	}
	public static void TopSort(ArrayList<Edge> graph[]) {
		int indeg[] = new int[graph.length];
		calcIndeg(graph,indeg);
		Queue<Integer> q = new LinkedList<>();
		
		for(int i =0;i<indeg.length;i++) {
			if(indeg[i]==0) {
				q.add(i);
			}
		}
		while(q.isEmpty()) {
			int curr = q.remove();
			System.out.print(curr+" ");
			
			for(int i =0;i<graph[curr].size();i++) {
				Edge e = graph[curr].get(i);
				indeg[e.neighbour]--;
				if(indeg[e.neighbour]==0) {
					q.add(e.neighbour);
				}
				
			}
		}
	}

}
