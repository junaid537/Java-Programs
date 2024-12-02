
import java.util.*;
class BFS{
    static ArrayList<Integer> solve(int n, ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[n];
        ArrayList<Integer> bfs=new ArrayList<>();
        vis[0]=true;
        q.add(0);
        while(!q.isEmpty()){
            Integer node=q.poll();
            bfs.add(node);
            for(Integer it : adj.get(node)){
                if(vis[it]==false){
                    q.add(it);
                    vis[it]=true;
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        ArrayList<Integer> bfs=new ArrayList<>();

        int n=7;
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        /*
         * 0--1
         * 0--2
         * 1--3
         * 1--4
         * 2--5
         * 2--6
         */
        adj.get(0).add(1); adj.get(1).add(0); 
        adj.get(0).add(2);adj.get(2).add(0); 
        adj.get(1).add(3); adj.get(3).add(1); 
        adj.get(1).add(4);adj.get(4).add(1); 
        adj.get(2).add(5); adj.get(5).add(2);
        adj.get(2).add(6); adj.get(6).add(2);
        //adj.get(3).add(7); adj.get(7).add(3);
        
        bfs=solve(n,adj);
        for(Integer i : bfs)System.out.print(i);
        System.out.println();

    }
}