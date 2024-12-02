import java.util.*;
import java.io.*;
class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}

class NumOfIslandsVid8{
    static void bfs(int ro,int co, int visited[][],int grid[][]){
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(ro,co));
        visited[ro][co]=1;
        while(!q.isEmpty()){   
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();
            for(int i=-1;i<=1;i++){
                for(int j=-1;j<=1;j++){
                    int nrow=row+i;
                    int ncol=col+j;
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1 && visited[nrow][ncol]==0){
                        visited[nrow][ncol]=1;
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int grid[][]={{0,1,1,0},
                      {0,1,1,0},
                      {0,0,1,0},
                      {0,0,0,0},
                      {1,1,0,1}};
        int n=grid.length;
        int m=grid[0].length;
        int visited[][]=new int[n][m];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==0 && grid[i][j]==1){
                    System.out.print(i);System.out.print(j);System.out.println();
                    bfs(i,j,visited,grid);
                    cnt++;  
                }
            }
        }
        System.out.println("count= "+cnt);
    }
}


// SC:O(N^2)+O(N^2) :visited[][] and queue

/*TC : if all matrix filled filled with 1 , then O(N^2)*8 , 8 because for each cell in 8 directions 
       O( N^2 +  N^2 * 8)
       line45
  
  
*/