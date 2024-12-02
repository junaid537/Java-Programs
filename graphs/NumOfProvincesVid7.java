import java.util.*;
import java.io.*;

class NumOfProvincesVid7{

    public static void solve(int i, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        vis[i]=true;
        for(Integer it: adj.get(i)){
            if(vis[it]==false)
            solve(it,adj,vis);
        }
    }
    public static void main(String[] args) {
        int n=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)adj.add(new ArrayList<Integer>());
        adj.get(0).add(1); adj.get(1).add(0);
        //adj.get(1).add(5); adj.get(5).add(1);

        adj.get(0).add(2); adj.get(2).add(0);
        //adj.get(0).add(3); adj.get(3).add(0);
        //adj.get(0).add(4); adj.get(4).add(0);
        //adj.get(2).add(4); adj.get(4).add(2);
        adj.get(3);
        adj.get(4);
        
        boolean vis[]=new boolean[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                cnt++;
                solve(i,adj,vis);
            }
            
        }
        System.out.println(cnt);

    }
}