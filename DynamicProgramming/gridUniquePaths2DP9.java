import java.util.*;
//import java.io.*;
//import java.lang.*;

class gridUniquepaths2DP9{
static int mazeObstaclesUtil(int i, int j, int[][] maze, int[][] dp) {
  if(i>0 && j>0 && maze[i][j]==-1) return 0; 
  if(i==0 && j == 0)
    return 1;
  if(i<0 || j<0)
    return 0;
  if(dp[i][j]!=-1) return dp[i][j];
    
  int up = mazeObstaclesUtil(i-1,j,maze,dp);
  int left = mazeObstaclesUtil(i,j-1,maze,dp);
  
  return dp[i][j] = up+left;
  
}

static int mazeObstacles(int n, int m, int[][] maze){
    int dp[][]=new int[n][m];
    for(int row[]: dp)
    Arrays.fill(row,-1);
    return mazeObstaclesUtil(n-1,m-1,maze,dp);
    
}

public static void main(String args[]) {

  int[][] maze = { {0,0,0},
                   {0,-1,0},
                   {0,0,0}};
                            
  int n = maze.length;
  int m = maze.length;
  
  System.out.println(mazeObstacles(n,m,maze));
}
}




