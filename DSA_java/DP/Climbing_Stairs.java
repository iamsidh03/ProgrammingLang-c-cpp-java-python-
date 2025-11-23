//https://leetcode.com/problems/climbing-stairs/description/

class Climbing_Stairs{
    public static void main(String[] args) {
        int n=45;    
        int []dp= new int[n+1];
       
        System.out.println("Using Memoization in DP "+cs_memo(n, dp));
        System.out.println("Using tabulation in DP "+cs_tabulation(n));
        System.out.println(cs(n));
    }
    public static int cs(int n){
       if(n<0){
        return 0;
       }
        if (n==0){
        return 1;
       }
        
        return cs(n-1)+cs(n-2);
    }

    //memoization
    public static int cs_memo(int n,int []dp){
        if(n<0){
         return 0;
        }
         if (n==0){
         return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
         
         dp[n]= cs_memo(n-1,dp)+cs_memo(n-2,dp);
         return dp[n];
     }

     //dp tabular
     public static int cs_tabulation(int n){
       int []dp=new int[n+1];
       dp[0]=1;
       
        for (int i = 1; i <=n; i++) {
           if(i==1){
            dp[i]=dp[i-1]+0;
           }
            else{dp[i]=dp[i-1]+dp[i-2];
            }  
        }
        return dp[n];
     }
}