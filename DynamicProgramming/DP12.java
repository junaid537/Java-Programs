import java.util.*;
public class DP12 {
    static int solve(int i,int j,int[][] dp,int mat[][],int m,int n){
        if(j<0 || j>=n){
            return (int)Math.pow(-10,9);
        }
        if(i==0)return mat[0][j];
        if(dp[i][j]!=-1)return dp[i][j];
        int up=mat[i][j]+solve(i-1,j,dp,mat,m,n);
        int ld=mat[i][j]+solve(i-1,j-1,dp,mat,m,n);
        int rd=mat[i][j]+solve(i-1,j+1,dp,mat,m,n);
        return dp[i][j]=Math.max(up,Math.max(ld,rd));
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,10,4},
                          {100,3,2,1},
                          {1,1,20,2},
                          {1,2,2,1}};
        int m=matrix.length;
        int maxi=Integer.MIN_VALUE;
        int n=matrix[0].length;
        int dp[][]=new int[m][n];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        for(int j=0;j<n;j++){
            int ans=solve(m-1,j,dp,matrix,m,n);
            maxi=Math.max(maxi,ans);
        }
        System.out.println(maxi);
        
    }
    
}
/*
 * MEMOIZATION
 * TC: O(m*n) max cells is m*n in dp[][]
 * SC:O(m)*O(m*n)
 */