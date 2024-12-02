import java.util.*;
import java.io.*;

public class HelloWorld{

    static void printSequencesRecur(int arr[], int n, int k, int index)
{
int i;
if (k == 0)
{    if(arr[0]<arr[1]){
    for(Integer it:arr)System.out.print(it+" ");
    System.out.println();

}
    
}
if (k > 0)
{
    for(i = 1; i<=n; ++i)
    {
        arr[index] = i;
        printSequencesRecur(arr, n, k-1, index+1);
    }
}
}

    public static void main(String[] args) {
        System.out.println("hellll0");
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        System.out.println("madar"+a);
        int arr[]=new int[2];
        printSequencesRecur(arr,3,2,0);
    }
}