public class DP_01Knapsack {
    public static void main(String[] args) {
        int []val ={30,40,60};
        int []wt={3,2,5};
        System.out.println(knapsack(wt, val, 6, wt.length));
        System.out.println(knapsack_tabu( val, wt,6 ));
        System.out.println(dp_memo(wt, val, 6, wt.length));

    }

    //recursive code O(2^n)
    public static int knapsack(int wt[],int []val,int w,int n){
        if(n==0||w==0){
            return 0;
        }
        if(wt[n-1]<w){  // valid means included in weight
           return Math.max(val[n-1]+knapsack(wt, val, w-wt[n-1], n-1),knapsack(wt, val, w, n-1));
        }
        else{ //not included
           return knapsack(wt, val, w, n-1);
        }
        
    }
    public static int knapsack_memo(int wt[],int []val,int w,int n,int [][]dp){
        if(n==0||w==0){
            return 0;
        }
        if (dp[n][w]!=-1) {
            return dp[n][w];
        }
        if(wt[n-1]<w){  // valid means included in weight
           dp[n][w]= Math.max(val[n-1]+knapsack(wt, val, w-wt[n-1], n-1),knapsack(wt, val, w, n-1));
            return dp[n][w];
        }
        else{ //not included
           dp[n][w]= knapsack(wt, val, w, n-1);
           return dp[n][w];
        }
        
    }
    public static int dp_memo(int wt[],int []val,int w,int n){
        int [][]dp= new int[val.length+1][w+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
                
            }
        }
       return knapsack_memo(wt, val, w, n,dp);
    }

    // I have to revise again the knapsack tabulation method
    public static int knapsack_tabu(int []val,int []wt,int w){
        int n=val.length;
        int [][]dp= new int[n+1][w+1];
        for (int i = 0; i < dp.length; i++) { //make 1st column 0
            dp[i][0]=0;
            
        }
        for (int i = 0; i < dp[0].length; i++) { // make 1st row 0
            dp[0][i]=0; 
        }
        for (int i = 1; i < n+1; i++) {
            for(int j = 1; j <w+1; j++) {
                int v=val[i-1]; //ith item value;
                int W=wt[i-1]; //ith item weight
                if(W<=j){
                    dp[i][j]=Math.max(v+dp[i-1][j-W], dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }

        }   
        }
        return dp[n][w];
    }


}
