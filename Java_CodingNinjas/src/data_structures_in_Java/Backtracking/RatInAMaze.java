package data_structures_in_Java.Backtracking;

public class RatInAMaze {
	public static boolean solveMaze(int maze[][], int i,int j , int path[][]) {
		int N = maze.length;
		if(i<0||i>=N||j>=N||j<0||maze[i][j]==0|| path[i][j]==1) {
			return false;
		}
		path[i][j] = 1;
		
		if(i==N-1&&j==N-1) {
			return true;
		}
		if(solveMaze(maze,i-1,j,path)) {
			return true;
		}
		if(solveMaze(maze,i,j+1,path)) {
			return true;
		}
		if(solveMaze(maze,i+1,j,path)) {
			return true;
		}
		if(solveMaze(maze,i,j-1,path)) {
			return true;
		}
		return false;
	}
	public static boolean ratInAMaze(int maze[][]){
		int N = maze.length;
		int path[][] = new int[N][N];

		for(int i =0;i<maze[i][1];i++) {
			for(int j =0;j<maze[i][j];i++) {
				if(maze[i][j]!=0) {
					path[i][j]=1;
				}
			}
		}
		return solveMaze(maze,0,0,path);

	}

}
