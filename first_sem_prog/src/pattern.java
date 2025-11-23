public class pattern {
    public static int pattern1(int n) {
        /*
         *
         *  *
         *  *  *
         *  *  *  *
         *  *  *  *  *
         */
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        return n;
    }

    public static int pattern2(int n){
        System.out.println("\n\n\n");
        /*
         *  *  *  *  *
         *  *  *  *  *
         *  *  *  *  *
         *  *  *  *  *
         *  *  *  *  *
         square pattern
         */
        for (int row =1;row<=n;row++){
            for (int col=1;col<=n;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        return n;
    }
    public static int pattern3(int n){
        System.out.println("\n\n\n");
        for (int row=1;row<=n;row++){
            for (int j =1;j<=n-row+1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        return n;
    }
    public static int pattern4(int n){
        for (int row=1;row<=n;row++){
            for (int col =1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
        return n;
    }
    public static int patter5(int n){
        for (int row=1;row<=2*n;row++){
            int totalRowInCol=row>n?n:row;
            //for (int col=1;col<=)
        }
        return n;
    }

    public static void main(String[] args) {
         pattern4(5);
    }
}

