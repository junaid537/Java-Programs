import java.util.*;
import java.io.*;
class DP5{
    static int solve(int n,int[] arr){
        if(n<0)return 0;
        int pick=arr[n]+solve(n-2,arr);
        int notpick=solve(n-1,arr);
        return Math.max(pick,notpick);
    }
    static int memoization(int n,int[] arr,int dp[]){
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        int pick=arr[n]+memoization(n-2,arr,dp);
        int notpick=memoization(n-1,arr,dp);
        return dp[n]=Math.max(pick,notpick);
    }

    static int tabulation(int n,int []arr){
        int[] dp=new int[n];
        dp[0]=arr[0];
        for(int i=1;i<n;i++){
            int pick=arr[i];
            if(i>1)
            pick+=dp[i-2];
            int notpick=dp[i-1];
            dp[i]=Math.max(pick,notpick);
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        int arr[]={1,2,3, 1, 3, 5, 8, 1, 9};
        //int arr[]={1,2,4};
        int n=arr.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(solve(n-1,arr));
        System.out.println(memoization(n-1,arr,dp));
        System.out.println(tabulation(n,arr));

    }
}