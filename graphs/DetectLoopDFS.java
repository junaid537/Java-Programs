import java.util.*;

public class DetectLoopDFS {
    public static boolean  solve(int start, int parent, boolean[] vis, ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> dfs){
        dfs.add(start);
        vis[start]=true;
        for(int it:adj.get(start)){
            if(vis[it]==false){
                if(solve(it,start,vis,adj,dfs)==true)return true;
            }
            else if(it!=parent)return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();   
        int V=6;
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }     
        boolean[] vis=new boolean[V];
        ArrayList<Integer> dfs=new ArrayList<>();
        adj.get(0).add(1); adj.get(1).add(0);
        adj.get(1).add(5); adj.get(5).add(1);

        adj.get(0).add(2); adj.get(2).add(0);
        adj.get(2).add(4); adj.get(4).add(2);
        adj.get(2).add(3); adj.get(3).add(2);
       // adj.get(0).add(4); adj.get(4).add(0);//Loop maker
        int parentOfStart=-1;
        boolean isCycle=solve(0,parentOfStart,vis,adj,dfs);
        for(Integer it:dfs)System.out.print(it);
        System.out.println();
        System.out.print(isCycle);
    }
}
