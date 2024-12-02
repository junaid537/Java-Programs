import java.util.*;
//TC :O(N+2E)
class Pair{
    int first, second;
    Pair (int first,int second){
        this.first=first;
        this.second=second;
    }
}

public class detectCycleVid11 {


    static boolean detectCycle(int startNode ,ArrayList<ArrayList<Integer>> adj,boolean vis[]){
        Queue<Pair> q=new LinkedList<>();
         q.add(new Pair(startNode,-1));
         vis[startNode]=true;
         while(!q.isEmpty()){
            int node= q.peek().first;
            int parent=q.peek().second;
            q.remove();
            for(int adjacentNode : adj.get(node)){
                if(vis[adjacentNode] == false){
                    q.add(new Pair(adjacentNode,node));
                    vis[adjacentNode]=true;
                }
                else if (parent != adjacentNode){
                    return true;
                }
            }
         }
         return false;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
        int n=7;//1 based indexing for graph vertices
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        boolean vis[]=new boolean[7+1];
        Arrays.fill(vis,false);
        adj.get(1).add(2);  adj.get(2).add(1);
        adj.get(1).add(3);  adj.get(3).add(1);
        adj.get(3).add(4);  adj.get(4).add(3);
        adj.get(2).add(5);  adj.get(5).add(2);
        adj.get(3).add(6);  adj.get(6).add(3);
        adj.get(5).add(7);  adj.get(7).add(5);
        adj.get(6).add(7);  adj.get(7).add(6);

        //maybe components there
        int flag=0;
        for(int i=1;i<n+1;i++){
            if(vis[i]==false)
            {
                if(detectCycle(i,adj,vis)==true){System.out.println(true) ;flag=1;}
            }
        }
        if(flag==0)
        System.out.println(false);
    }
}
