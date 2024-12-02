import java.util.*;
//import java.lang.*;
public class minOfAllPathsDP10 {
    
    public static void main(String[] args) {
        int mat[][]={{5,9,6},{11,5,2}};
        int m=mat.length;
        int n=mat[0].length;
        int prev[]=new int[n];
        //Arrays.fill(prev,0);
        for(int i=0;i<m;i++){
            int curr[]=new int[n];
            for(int j=0;j<n;j++){
                if(i==0&&j==0)curr[j]=mat[i][j];
                else{
                    int up=mat[i][j];
                    if(i>0)up+=prev[j];
                    else up+=(int)Math.pow(10,9);
                    int left=mat[i][j];
                    if(j>0)left+=curr[j-1];
                    else left+=(int)Math.pow(10,9);
                    curr[j]=Math.min(up,left);
                    
                }
                
            }
            prev=curr;
        }
        System.out.println(prev[n-1]);
      
    }
    
}
