import java.util.*;
public class DP21MinimumCoins {
    static int solve(int ind,int T,int[] arr){
        //if(ind==0 && T ==0)return (int)Math.pow(10,9);
        if(ind==0){
            if(T % arr[ind]==0){
                System.out.println("hi1--"+T+ind);
                return T/arr[ind];
            }
            System.out.println("hi2");
            return (int)Math.pow(10,9);
        }
        int notTake=0 + solve(ind-1,T,arr);
        int take=Integer.MAX_VALUE;
        if(arr[ind]<=T)
        take=1 + solve(ind , T-arr[ind] , arr);

        return Math.min(notTake,take);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};int target=8;
        //int arr[]={1,2};int target=4;
        int n=arr.length;
        int [][]dp=new int[n][target+1];
        int ans=solve(n-1,target,arr);
        System.out.println(ans);
    }
}
