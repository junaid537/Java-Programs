import java.util.*;
public class CombSum1 {
    static void solve(int ind,List<List<Integer>> anslist,ArrayList<Integer> ds,int arr[],int target,int n){
        if(ind==n){
            if(target==0){
                anslist.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=target)
        {
        ds.add(arr[ind]);
        solve(ind,anslist,ds,arr,target-arr[ind],n); //u can pick an element more than onve in a subset
        ds.remove(ds.size()-1);
        }
        
        solve(ind+1,anslist,ds,arr,target,n);

    }
 public static void main(String[] args) {
    int arr[]={2,3,4,6,7};
    int target=7;
    List<List<Integer>> anslist=new LinkedList<>();
    ArrayList<Integer> ds=new ArrayList<>();
    solve(0,anslist,ds,arr,target,arr.length);
    for(List<Integer> it:anslist)System.out.println(it);
 }   
}
