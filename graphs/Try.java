import java.util.*;

public class Try {
    static ArrayList<Integer> solve(int n,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[n+1];
        q.add(1);visited[1]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            bfs.add(node);
            for(Integer it:adj.get(node)){
                if(!visited[it]){
                    q.add(it);
                    visited[it]=true;
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args){
        int n=8;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);adj.get(2).add(1);
        adj.get(1).add(6);adj.get(6).add(1);
        adj.get(2).add(4);adj.get(4).add(2);
        adj.get(2).add(3);adj.get(3).add(2);
        adj.get(6).add(7);adj.get(7).add(6);
        adj.get(6).add(8);adj.get(8).add(6);
        adj.get(4).add(5);adj.get(5).add(4);
        adj.get(7).add(5);adj.get(5).add(7);

        ArrayList<Integer> bfs = solve(n,adj);
        for(Integer i : bfs)System.out.print(i);
        System.out.println();

    }
    
}
