import java.util.*;
import java.io.*;
class climbingStairsDP2{
    static int climbSimpleRecursion(int n){
        if(n==0 || n==1)return 1;
        int left=climbSimpleRecursion(n-1);
        
        int right=climbSimpleRecursion(n-2);
        return left+right;
    }
    static int climbTabulationMethod(int n){
        int i=0;
        int arr[]=new int[n+1];
        Arrays.fill(arr,0);
        arr[0]=1;arr[1]=1;
        for(i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public static void main(String[] args) {
        System.out.println(climbSimpleRecursion(4));
        System.out.println(climbTabulationMethod(4));


    }
}