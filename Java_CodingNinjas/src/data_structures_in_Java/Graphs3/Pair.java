package data_structures_in_Java.Graphs3;

public class Pair{
	int n;
	int path;
	public Pair(int n , int path) {
		this.n=n;
		this.path=path;
}
	public int compareTo(Pair p2) {
		return this.path-p2.path;
	}
}
