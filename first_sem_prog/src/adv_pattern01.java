public class adv_pattern01 {
    public static void hollow_rectangle(int totrows, int totcols){
      //outer loop
        for(int i=1; i<=totrows;  i++){
            //inner- columns
            for(int j=1; j<=totcols; j++){
                //cell-(i,J)
                if(i == 1||i == totrows||j == 1||j == totcols){
                    //boundary cells
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
       /*
    public static void inverted_rotated_half_pyramid(int n){
        //outer
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
            System.out.println(" ");

        }
            //stars
            for(int j=1; j<=i; j++){
                System.out.println("*");
            }


    }

        */


    }


