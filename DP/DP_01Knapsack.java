public class DP_01Knapsack {
    public static void main(String[] args) {
        int []val ={30,40,60};
        int []wt={3,2,5};
        System.out.println(knapsack(wt, val, 6, wt.length));
    }

    //recursive code
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
}
