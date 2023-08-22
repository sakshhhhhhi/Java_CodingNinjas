package data_structures_in_Java.Graphs3;

public class Edges {
	public static class Edge{
		int src; 
		int neighbour;
		int weight;
		
		Edge(int src, int neighbour, int weight){
			this.src =src;
			this.neighbour=neighbour;
			this.weight= weight;
		}
	}

}
