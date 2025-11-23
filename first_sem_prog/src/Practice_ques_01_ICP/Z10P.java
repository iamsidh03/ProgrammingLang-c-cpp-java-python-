package Practice_ques_01_ICP;

public class Z10P {

    public static void main(String[] args) {
        /*
                boolean a = 2;
                boolean b = 2;
                boolean result = b && a;
                System.out.println(result);

                Gives error because && operrator use to check condition
         */
        /*
        int a = 2;
        int b = 3;
         int result = (a + b);
        System.out.println(result);

        no error
         */
        /*

        int a = 2;
        int b = 3;
        int result = (a>b)?a:b;
        System.out.println(result);

         */
        int a = 2;
        int b = 3;
        //boolean result =(a<b) &&(a==b)  ; //no error
        boolean result;
        if ((a < b) && (b==a))
            result = true;
        else
            result = false;

        System.out.println(result); //false BECAUSE OF && (LOGICAL AND OPERATOR)




            }
        }

