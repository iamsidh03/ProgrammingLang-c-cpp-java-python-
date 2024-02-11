public class DP_Targetsum {
    
    public static void main(String[] args) {
        int []arr={4,2,7,1,3};
        int sum=100;
        System.out.println("tarsut sum present T/F is "+targetSum(arr, sum));
        
    }
    public static boolean targetSum(int []arr,int sum){
        int n=arr.length;
        boolean dp[][] = new boolean[n+1][sum+1];
        // i== items &&j==target sum
        for (int i = 0; i < n+1; i++) { // make true if sum is 0 as we can return  empty array
            dp[i][0]=true;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                int v=arr[i-1];
                if(v<=j&&dp[i-1][j-v]==true){
                    dp[i][j]=true;
                }
                else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
            }
        }
        return dp[n][sum];
    }
}
