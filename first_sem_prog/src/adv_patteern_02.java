public class adv_patteern_02 {

    //for (int i= rows-1; i>=0 ; i--)
    //    {
    //    for (int j=0; j<=i; j++)

    /*static void RevStar(int m){
        for (int k =l-1;k>=0;k++){
            for (int l=0; l<k+1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

     */
    static void stars(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //print stats
            stars(5);
            //RevStar(5);



    }
}
