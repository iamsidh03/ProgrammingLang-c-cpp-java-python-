public class coin_change {
    public static void main(String[] args) {
        int []coin={1,2,3};
        int sum=4;
        System.out.println("sum "+tabu_CoinChange(coin, sum));
    }
    public static int tabu_CoinChange(int []coin,int sum){
        int n=coin.length;
        int dp[][]= new int[n+1][sum+1];
        for (int i = 0; i < dp.length; i++) {
                dp[i][0]=1;
            
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i]=0;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if (coin[i-1]<=j) {
                    dp[i][j]=dp[i][j-coin[i-1]]+dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
            
        }
        return dp[n][sum];
    }
}


