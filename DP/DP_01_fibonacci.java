class DP_01_fibonacci{
public static void main(String[] args) {
    int n=30;
   // int []dp=new int[n+1];
    System.out.println(fibo_tabular(n));
    System.out.println(fibo(n));
    
}
//using Memoization  O(n)
public static int fibo_memo(int n ,int []dp){
    if(n==0||n==1){
        return n;
    }
    if(dp[n]!=0){
        return dp[n];
    }
    dp[n]= fibo_memo(n-1,dp)+fibo_memo(n-2,dp);
    return dp[n];
    
    
}
// using tabular  O(n)
public static int fibo_tabular(int n){
    int []dp= new int[n+1];
    dp[1]=1; //not need to initialised dp[0] in java because by default empty index is initialised as 0 in java
    for (int i = 2; i <=n; i++) {
        dp[i]=dp[i-1]+dp[i-2];

    }
    return dp[n];
}

// normal recursive approach T.C : O(2^n)
public static int fibo(int n){
    if(n==0||n==1){
        return n;
    }
    return fibo(n-1)+fibo(n-2);

}
}