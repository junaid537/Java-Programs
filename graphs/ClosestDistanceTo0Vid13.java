//leetcode -542. 01 Matrix (medium)

import java.util.*;
class Node{
    int row,col,steps;
    public Node(int row,int col,int steps){
        this.row =row;
        this.col=col;
        this.steps=steps;
    }
}
class ClosestDistanceTo0Vid13 {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int vis[][]=new int[m][n];
        int dist[][]=new int[m][n];
        Queue<Node> q=new LinkedList<>();
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++){
            if(mat[i][j]==1){
                vis[i][j]=1;
                q.add(new Node(i,j,0));
            }
            else{
                vis[i][j]=0;
            }
        }
        //O(mxnx4)
        while(!q.isEmpty()){
            int row=q.peek().row;
            int col=q.peek().col;
            int steps=q.peek().steps;
            dist[row][col]=steps;
            q.remove();
            int nr[]={0,1,0,-1};
            int nc[]={-1,0,1,0};
            for(int i=0;i<4;i++){
                int nrow= row + nr[i];
                int ncol=col+nc[i];
                if(nrow>=0 && nrow <m && ncol>=0 && ncol<n && vis[nrow][ncol]==0){
                    q.add(new Node(nrow,ncol,steps+1));
                    vis[nrow][ncol]=1;
                }
            }
        }
        return dist;
    }
}
