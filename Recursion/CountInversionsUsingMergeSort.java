import java.util.*;
//Just use BFS 
class CountInversionsUsingMergeSort {
    public static int merge(int[] arr,int l,int mid,int r){
        int temp[]=new int[r-l+1];
        int inv_count=0;
        int i=0;
        int left=l,right=mid+1;
        while(left<= mid && right<=r){
            if(arr[left]<=arr[right]){
                temp[i]=arr[left];
                left++;
            }
            else{
                inv_count=inv_count + (mid+1-left);
                temp[i]=arr[right];
                right++;
            }
            i++;
        }
        while(left<=mid){
            temp[i]=arr[left];
            left++;
            i++;
        }
        while(right<=r){
            temp[i]=arr[right];
            right++;
            i++;
        }
        int k=0;
        for(int j=l;j<=r;j++){
            //System.out.print(temp.get(k)+" ");
            arr[j]=temp[k];
            k++;
        }
        //System.out.println();
        return inv_count;
    }
    public static int mergeSort(int[] arr,int l,int r){
        int inv_count=0;
        if(r>l){
            int mid=(l+r)/2;
            inv_count+=mergeSort(arr,l,mid);
            inv_count+=mergeSort(arr,mid+1,r);
            inv_count+=merge(arr,l,mid,r);
            
        }
        return inv_count;
    }
	public static void main (String[] args) {
		System.out.println("GfG!");
		int arr[]={2,6,1,4,9,0,3};
		int n=arr.length;
		int ans=mergeSort(arr,0,n-1);
		for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
		System.out.println();
		System.out.print(ans);
	}
}
