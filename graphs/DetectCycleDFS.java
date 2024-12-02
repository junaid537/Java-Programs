
import java.util.*;
class DetectCycleDFS{
    public static boolean dfs(int i, int parent, int[] visited,ArrayList<ArrayList<Integer>> adj){
        visited[i]=1;
        for(int adjnode: adj.get(i)){
            if(visited[adjnode]==0){
                if(dfs(adjnode,i,visited,adj)==true){
                    return true;
                }
            }
            else if(adjnode!=parent)return true;
        }
        return false;

    }
    public static void main(String[] args){
        int n=4;
        int visited[]=new int[n+1];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }
        Arrays.fill(visited,0);
        adj.get(1).add(2); adj.get(2).add(1);
        adj.get(2).add(3); adj.get(3).add(2);
        adj.get(3).add(4); adj.get(4).add(3);
        adj.get(4).add(1); adj.get(1).add(4);//just comment this , and u get cycle no exist
        for(int i=1;i<=n;i++){
            if(visited[i]==0){
                if(dfs(i,-1,visited,adj)==true){/*return true;*/System.out.println("Cycle exist");return;}
            }
        }
        System.out.println("Cycle doesnt exist");
    }
}