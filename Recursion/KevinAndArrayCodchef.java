import java.util.*;
public class KevinAndArrayCodchef{
public static void main(String[] args) {
    long n=3,k=1;
    long a[]={-100,0,100};
    if(n==1 || n==k)    System.out.print(0);//return 0;
    long l=0,r=(long)2*1000000007,ans=r;
    while(l<=r)
    {
        long mid=(l+r)/2;
        long A=(long)Math.pow(10,18);
        //ve<ll> dp(n,C);
        //ArrayList<long> al=new ArrayList<long>(n);
        long dp[]=new long[(int)n];
        Arrays.fill(dp,A);
    
        dp[0]=0;
        for(int i=1;i<n;i++)
        {
            dp[i]=i;
            for(int j=0;j<i;j++)
            {
                long x=Math.abs((long)a[j]-a[i])-1;
                if((mid!=0 && (x/mid)<=i-j-1) || (mid==0 && a[i]==a[j]))
                    dp[i]=Math.min(dp[i],dp[j]+i-j-1);
            }
        }
        long y=dp[(int)n-1];
        for(long i=n-2,j=1;i>=0;i--,j++)
            y=Math.min(y,dp[(int)i]+j);
        if(y>k)
            l=mid+1;
        else
        {
            ans=Math.min(ans,mid);
            r=mid-1;
        }
    }

       System.out.println(ans);
}
 
}

// import java.io.*;
// import java.lang.*;
// import java.util.*;
// public class ans {
//    static int n,k;
//    static int a[]={4,7,4,7,4};
//    static int dp[]=new int[2003];

//    static boolean chk(int val){
//     for(int i=0;i<n;i++)dp[i]=100000;
//    dp[0]=0;
//    for(int i=1;i<n;i++){
//        dp[i]=i;
//        for(int j=0;j<i;j++){
//            if((Math.abs(a[i]-a[j])+(i-j)-1)/(i-j)<=val)
//            dp[i]=Math.min(dp[i],dp[j]+i-j-1);

//        }
//    }
//    int mn=100000;
//    for(int i=0;i<n;i++){
//        mn=Math.min(mn,dp[i]+n-i-1);   
//    }
//    return (mn<=k);
//   }
//    public static void main(String[] args) {
//     int l=-1,r=2000000001;
//     Scanner sc=new Scanner(System.in);
//     int n=5;
//     int k=2;
    
//     while(r-l>1){
//         if(chk((r+l)/2)){
//             r=(r+l)/2;
//         } else {
//             l=(r+l)/2;
//         }
//     }
//     System.out.println(r);
//    }
// }
/*
 #include <iostream>
using namespace std;

int n,k;
int a[2003];
int dp[2003];
bool chk(int val){
    for(int i=0;i<n;i++)dp[i]=100000;
    dp[0]=0;
    for(int i=1;i<n;i++){
        dp[i]=i;
        for(int j=0;j<i;j++){
            if((abs(a[i]-a[j])+(i-j)-1)/(i-j)<=val)
            dp[i]=min(dp[i],dp[j]+i-j-1);
        }
    }
    int mn=100000;
    for(int i=0;i<n;i++){
        mn=min(mn,dp[i]+n-i-1);
    }
    return (mn<=k);
}

int main(){
    unsigned int l=-1,r=2000000001;
    cin>>n>>k;
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    while(r-l>1){
        if(chk((r+l)/2)){
            r=(r+l)/2;
        } else {
            l=(r+l)/2;
        }
    }
    cout<<r<<endl;
} 
 
 */
