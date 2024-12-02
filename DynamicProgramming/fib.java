//memoization
import java.util.*;
import java.io.*;

class fib{
    //memoization
    static int fibonaccci(int n,int[] dp){
        if(n==0 || n==1)return n;
        if(dp[n]!=-1)return dp[n];
        return dp[n]=fibonaccci(n-1,dp)+fibonaccci(n-2,dp);
    }
    //Tabulation or Bottom-Up
    static int tabulation(int n){
        int dp[]=new int[n+1];Arrays.fill(dp,0);
        dp[0]=0;dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];

        }
        return dp[n];

    }
    //space optimization
    static int spaceOptimized(int n){
        int prev=1,prev2=0,curri;
        for(int i=2;i<=n;i++){
            curri=prev+prev2;
            prev2=prev;
            prev=curri;
        }
        return prev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=fibonaccci(n,dp);
        int ans1=tabulation(n);
        int ans2=spaceOptimized(n);
        System.out.println(ans+" "+ans1+" "+ans2);
    }
}
// import java.util.*;
// import java.io.*;

// class fib{

//     static int fibonaccci(int n){
//         if(n==0 || n==1)return n;
//         return fibonaccci(n-1)+fibonaccci(n-2);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int ans=fibonaccci(n);
//         System.out.println(ans);
//     }
// }