import java.util.*;
public class SubsetSum2 {
    static void solve(int ind,ArrayList<Integer> ds, List<List<Integer>> anslist,int[] arr,int n){
        anslist.add(new ArrayList<Integer>(ds));
        for(int i=ind;i<arr.length;i++){
            if(i!=ind && arr[i]==arr[i-1])continue;
            ds.add(arr[i]);
            solve(i+1,ds,anslist,arr,n);
            ds.remove(ds.size() -1);
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3};
        List<List<Integer>> anslist=new LinkedList<>();
        ArrayList<Integer> ds=new ArrayList<Integer>();
        solve(0,ds,anslist,arr,arr.length);
        for(List<Integer> it:anslist){
            System.out.println(it);
        }   
    }
}
