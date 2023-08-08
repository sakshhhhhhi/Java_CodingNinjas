package data_structures_in_Java.Backtracking;

public class RatInAMazeAllPaths {
	static void printAllPaths(int[][]maze, int i , int j , int[][] path){
		int n = maze.length;
	
		if(i>=n||j>=n||i<0||j<0||maze[i][j]==0||path[i][j]==1){
			return;
		}
		path[i][j]=1;
		if(i==n-1&&j==n-1){
			for(int r =0;r<n;r++){
				for(int c =0;c<n;c++){
					System.out.print(path[r][c]+" ");
				}
			}
			System.out.println();
		}
		printAllPaths(maze, i-1, j, path);
		printAllPaths(maze, i, j+1, path);
		printAllPaths(maze, i+1, j, path);
		printAllPaths(maze, i, j-1, path);
		path[i][j]=0;
		return;

	}


	static void ratInAMaze(int maze[][], int n) {
		/* 
			* Your class should be named Solution.
			* Write your code here
		 */
		 int path[][] = new int[n][n];
		 printAllPaths(maze,0,0,path);

	}
	public static void main(String[] args) {
		int maze[][]= {{1,1,0},{1,1,0},{0,1,1}};
		int n =3;
		ratInAMaze(maze,n);
	}

}
