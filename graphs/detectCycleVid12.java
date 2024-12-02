import java.util.*;
public class detectCycleVid12 {

    public static boolean dfs(int node,int parent,ArrayList<ArrayList<Integer>> adj,boolean vis[]){
        vis[node]=true;
        for(int it : adj.get(node)){
            if(vis[it]==false){
                if(dfs(it,node,adj,vis)==true)return true;
            }
            else if(/*visited &&  */it !=parent )return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int total_nodes=7;
        boolean vis[]=new boolean[7+1];//1 based indexing
        Arrays.fill(vis,false);
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=total_nodes;i++){
            adj.add(new ArrayList<Integer>());
        }
        adj.get(1).add(2);  adj.get(2).add(1);
        adj.get(1).add(3);  adj.get(3).add(1);
        adj.get(3).add(4);  adj.get(4).add(3);
        adj.get(2).add(5);  adj.get(5).add(2);
        adj.get(3).add(6);  adj.get(6).add(3);
        adj.get(5).add(7);  adj.get(7).add(5);
        adj.get(6).add(7);  adj.get(7).add(6);
        int flag=0;
        int parent=-1;//parent of start node
        //for different componets
        for(int i=0;i<=total_nodes;i++ ){
            if(vis[i] !=true){
                if(dfs(i,parent,adj,vis)==true)
                {flag=1;
                System.out.println("true");
                break;}
                
            }

        }
        if(flag==0)System.out.println("false from line 43");
        //TC :O(N+E)



    }
}
