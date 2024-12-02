import java.util.*;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String str1="abcjklp";
        String str2="acjkp";
        int m=str1.length();
        int n=str2.length();
        int dp[][]=new int [m+1][n+1];
        for(int i=0;i<m+1;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<n+1;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
            }
        }
        int maxi=Integer.MIN_VALUE;
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                maxi=Math.max(maxi,dp[i][j]);
            }
        }
        System.out.println(maxi);
    }
}
