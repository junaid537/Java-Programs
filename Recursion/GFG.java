/*package whatever //do not write package name here */
//All recursion ques solved by me
import java.util.*;

class GFG {
    public static void solve(int n){
        if(n==0)return;
        else{System.out.println("k"+n);
        n-=1;
        solve(n);}
    }
    public static int sumOfN(int i,int n){
        if(i>=n)return i;
        return i+sumOfN(i+1,n);
    }
    public static void subsequences(int i,int[] arr,ArrayList<Integer> ds){
        if(i>=arr.length){
            for(int it:ds)System.out.print(it+" ");
            if (ds.size()==0)System.out.print("{}");
            System.out.println();
            return;
        }
        //System.out.print(arr[i]+" ");
        ds.add(arr[i]);
        subsequences(i+1,arr,ds);
        ds.remove(ds.size()-1);
        subsequences(i+1,arr,ds);
    }
	public static void main (String[] args) {
		System.out.println("GfG!");
		solve(5);
		System.out.println(sumOfN(1,100));//sum of 0 to 3
		int arr[]={1,2,3};
		ArrayList<Integer> ds=new ArrayList<Integer>();
		subsequences(0,arr,ds);
	}
}
