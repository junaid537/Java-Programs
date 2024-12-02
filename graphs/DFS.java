import java.io.*;
import java.util.*;

class DFS{

    public static void solveDFS(int startnode,boolean[] vis,ArrayList<Integer> dfs,ArrayList<ArrayList<Integer>> adj){
        vis[startnode]=true;
        dfs.add(startnode);
        for(Integer it :adj.get(startnode)){
            if(vis[it]==false){
                solveDFS(it,vis,dfs,adj);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        ArrayList<Integer> dfs=new ArrayList<>();
        int n=6 ;
        boolean vis[]=new boolean[n]; 

        for(int i=0;i<n;i++)adj.add(new ArrayList<Integer>());
        adj.get(0).add(1); adj.get(1).add(0);
        adj.get(1).add(5); adj.get(5).add(1);

        adj.get(0).add(2); adj.get(2).add(0);
        adj.get(0).add(3); adj.get(3).add(0);
        //adj.get(0).add(4); adj.get(4).add(0);
        adj.get(2).add(4); adj.get(4).add(2);

        solveDFS(0,vis,dfs,adj);

       
        for(Integer it:dfs)System.out.print(it);
    }
}
//     dfs[]  vis[]  recursion stack space
//SC : O(N) + O(N) +O(N)


//TC : O(N) + sum of all degrees      
//sum of all degress in undirected graph = 2*E