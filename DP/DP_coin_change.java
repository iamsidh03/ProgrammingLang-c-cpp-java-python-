/**
 * DP_coin_change
 */
public class DP_coin_change {

    public static void main(String[] args) {
        int []coin={2,5,3,6};
        int sum=10;
        System.out.println(coin_tabu(coin, sum));

    }
    public static  int coin_tabu(int []coin,int sum){
        int n=coin.length;
        int dp[][]=new int[n+1][sum+1];
        for (int i = 0; i <n+1  ; i++) {
                dp[i][0]=1;
        }
        for (int i = 0; i < sum+1; i++) {
            dp[0][i]=0;
            
        }
        for (int j = 1; j <n+1; j++) {
            for (int i = 1; i <sum+1; i++) {
                if(coin[j-1]<=i){
                    dp[j][i]=dp[j][i-coin[j-1]]+dp[j-1][i];
                }
                else{
                    dp[j][i]=dp[j-1][i];
                }
                
            }
        }
        return dp[n][sum];

    }
}