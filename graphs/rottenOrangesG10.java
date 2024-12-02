import java.util.LinkedList;
import java.util.Queue;

class Pair{
  int r,c,t;
  public Pair(int r,int c,int t){
      this.r=r;
      this.c=c;
      this.t=t;
  }
}
class Solution {
  public int orangesRotting(int[][] grid) {
      int n=grid.length,fresh=0;
      int m=grid[0].length;
      int visited[][]=new int[n][m];
      Queue<Pair> q=new LinkedList<Pair>();
      for(int i=0;i<n;i++)
      for(int j=0;j<m;j++){
          if(grid[i][j]==2){
              visited[i][j]=2;
              q.add(new Pair(i,j,0));
          }
          else visited[i][j]=0;
          if(grid[i][j]==1)fresh++;
      }
      int cnt=0,maxTime=0;
      while(!q.isEmpty()){
          int r=q.peek().r;
          int c=q.peek().c;
          int time=q.peek().t;
          maxTime=Math.max(maxTime,time);
          q.remove();
          int dr[]={-1,0,1,0};
          int dc[]={0,-1,0,1};
          for(int i=0;i<4;i++){
              if(r+dr[i]>=0 && r+dr[i]<n && c+dc[i]<m && c+dc[i]>=0 && visited[r+dr[i]][c+dc[i]]==0 && grid[r+dr[i]][c+dc[i]]==1){
                  visited[r+dr[i]][c+dc[i]]=2;
                  q.add(new Pair(r+dr[i],c+dc[i],time+1));
                  cnt++;
              }
          }


      }
      //System.out.println(fresh+" "+cnt);
      if(fresh!=cnt)return -1;
      return maxTime;
  }
}