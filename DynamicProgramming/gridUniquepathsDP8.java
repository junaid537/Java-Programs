import java.util.*;
import java.io.*;


//Space optimized
class gridUniquepathsDP8{

    static int countWays(int m,int n){
        int prev[]=new int[n];
        for(int i=0;i<m;i++){
            int curr[]=new int[n];
            for(int j=0;j<n;j++){
                if(i==0 && j==0){curr[0]=1;continue;}
                int up=0;
                int left=0;
                if(i>0)up=prev[i-1];
                if(j>0)left=curr[j-1];
                curr[j]=up+left;
            }
            prev=curr;
        }
        return prev[n-1];
    }
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int grid[][]=new int[m][n];
        System.out.println(countWays(m,n));
    }
}