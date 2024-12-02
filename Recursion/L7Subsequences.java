import java.io.*;
import java.util.*;
import java.lang.*;


class L7Subsequences{
    //printing all subsequences
    static void solve(int ind, int s,int sum, ArrayList<Integer> ds,int n,int arr[]){
        if(ind==n){
            if(s==sum){
                for(Integer it:ds){System.out.print(it+" ");}System.out.println();
            }
            return;
        }
        ds.add(arr[ind]);
        s+=arr[ind];
        solve(ind+1,s,sum,ds,n,arr);
        s-=arr[ind];
        ds.remove(ds.size()-1);
        solve(ind+1,s,sum,ds,n,arr);
    }
    //technique to print only 1 subsequence
    static boolean firstSubsequence(int ind, int s,int sum, ArrayList<Integer> ds,int n,int arr[]){
        if(ind==n){
            if(s==sum){
                for(Integer it:ds){System.out.print(it+" ");}
                System.out.println();
                return true;
            }
            return false;
        }
        ds.add(arr[ind]);
        s+=arr[ind];
        if(firstSubsequence(ind+1,s,sum,ds,n,arr)==true)return true;
        s-=arr[ind];
        ds.remove(ds.size()-1);
        if(firstSubsequence(ind+1,s,sum,ds,n,arr)==true)return true;
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> ds=new ArrayList<>(); 
        int arr[]={1,2,1};
        int n=arr.length,s=0,sum=2;
        solve(0,s,sum,ds,n,arr);//0 is start index or 0th index of array
        firstSubsequence(0,s,sum,ds,n,arr);
    }
}

