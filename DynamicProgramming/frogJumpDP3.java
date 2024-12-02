import java.util.*;
import java.io.*;

class frogJumpDP3{

    static int memoization(int n,int height[],int dp[]){
        if(n==0)return 0;
        if(dp[n]!=-1)return dp[n];
        int right=Integer.MAX_VALUE;
        int left=memoization(n-1,height,dp)+Math.abs(height[n]-height[n-1]);
        if(n>1)
        right=memoization(n-2,height,dp)+Math.abs(height[n]-height[n-2]);
        return dp[n]=Math.min(left,right);
    }
    static int tabulation(int n,int height[]){
        int dp[]=new int[n];
        dp[0]=0;
        int right=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            int left=dp[i-1]+Math.abs(height[i]-height[i-1]);
            if(i>1)
            right=dp[i-2]+Math.abs(height[i]-height[i-2]);
            dp[i]=Math.min(left,right);
        }
        return dp[n-1];

    }
    public static void main(String[] args) {
        int height[]={30,10,60,10,60,50};
        int n=height.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(memoization(n-1,height,dp));
        System.out.println(tabulation(n,height));
        
    }
}