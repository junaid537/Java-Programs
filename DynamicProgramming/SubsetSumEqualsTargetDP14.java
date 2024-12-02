import java.util.*;
//Tabulation /bottom-up approach


public class SubsetSumEqualsTargetDP14 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4}, target=4;
        int n=arr.length;
        boolean dp[][]=new boolean[n][target+1];
      
        //base cases
        for(int ind=0;ind<n;ind++)dp[ind][0]=true;//1st base case
        if(arr[0]==target)dp[0][arr[0]]=true;
        for(int ind=1;ind<n;ind++){
            for(int k=1;k<target+1;k++){
                boolean notTake=dp[ind-1][k];
                boolean take=false;
                if(k>=arr[ind])take=dp[ind-1][k-arr[ind]];
                dp[ind][k]=take || notTake;
            }
        }
        System.out.println(dp[n-1][target]);
    }
}
