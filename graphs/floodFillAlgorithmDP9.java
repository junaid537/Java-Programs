//My own solution
import java.util.*;
public class floodFillAlgorithmDP9 {
    static void solve(int i,int j,int[][] vis,int grid[][],int startvalue,int endvalue){
        int m=grid.length;
        int n=grid[0].length;
        grid[i][j]=endvalue;
        vis[i][j]=1;
        //System.out.println(i+" "+j);
        if(j-1>=0 && grid[i][j-1]==startvalue && vis[i][j-1]==0 )
        solve(i,j-1,vis,grid,startvalue,endvalue);
    
    
        if(i-1>=0 && grid[i-1][j]==startvalue && vis[i-1][j]==0) 
        solve(i-1,j,vis,grid,startvalue,endvalue);
    
   
        if(j+1<n && grid[i][j+1]==startvalue && vis[i][j+1]==0 )
        solve(i,j+1,vis,grid,startvalue,endvalue);
    
   
        if(i+1<m && grid[i+1][j]==startvalue && vis[i+1][j]==0)
        solve(i+1,j,vis,grid,startvalue,endvalue);
    }
	public static void main (String[] args) {
		int grid[][]={{1,1,1},{1,1,0},{1,0,1}};
		int m=grid.length;
        int n=grid[0].length;
		int endvalue=2,startvalue=1;
		int startrow=1,startcol=1;
		int vis[][]= new int[m][n];
		for(int row[]:vis)Arrays.fill(row,0);
		solve(startrow,startcol,vis,grid,startvalue,endvalue);
		for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
		    System.out.print(grid[i][j]);
		}
		System.out.println();
		}
	}
    
}


