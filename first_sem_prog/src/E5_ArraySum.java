public class E5_ArraySum {
    public static void main(String[] args) {

         //FIND SUM OF FLOAT
        /*
        float [] marks = {14.5f,445.8f,545.4f};
        float sum = 0;
        for ( float element: marks){
            sum = sum + element;
        }
        System.out.println( "the sum of floats is: " + sum);

         */

        //Find  number in Array is present or not

        float [] marks = {14.5f,445.8f,545.4f};
        float num = 14.5f;
        boolean INTheArray = false;
        for ( float element: marks){
            if ( num == element){
                INTheArray = true;
            }

        }
        if (INTheArray){
            System.out.println("num present in the array");

        }
        else{
            System.out.println("num not present in the array");
        }



    }
}
