public class E6_recursion_prob {

    //write a recursive function to write a sum of n natural number
    static int SumRec(int n){
        if (n==1){
            return 1;
        }else {
            return n + SumRec(n-1);
        }
    }
    public static void main(String[] args) {
        int c = SumRec(4);  //Enter Value
        System.out.println(c);




    }
}
