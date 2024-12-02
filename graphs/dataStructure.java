import java.io.*;
import java.util.*;

class dataStructure{
    public static void main(String[] args) {
        int n=3;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n+1;i++){
            adj.add(new ArrayList<Integer>());
        }
        //edge 1---2
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(1);
        for(int j=1;j<=n;j++){
            System.out.print(j+"->");
            for(int k=0;k<adj.get(j).size();k++){
                System.out.print(adj.get(j).get(k)+",");

            }
            System.out.println();
        }
    }
}
