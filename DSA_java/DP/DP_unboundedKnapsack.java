/**
 * DP_unboundedKnapsack
 */
public class DP_unboundedKnapsack {

    public static void main(String[] args) {
        int []val ={15,14,10,45,30};
        int []wt={2,5,1,3,4};
        System.out.println(un_tabu(wt, val, 7));

    }
    public static int un_tabu(int[]wt,int[]val,int w){
        int n=val.length;
        int[][] dp=new int[n+1][w+1];
        for (int i = 0; i <dp.length ; i++) {
            dp[i][0]=0;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i]=0;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < w+1; j++) {
                    int v=val[i-1];
                    int W=wt[i-1];
                    if(W<=j){
                        dp[i][j]=Math.max(v+dp[i][j-W],dp[i-1][j]);
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                
            }
            
        }
        return dp[n][w];
    }
}