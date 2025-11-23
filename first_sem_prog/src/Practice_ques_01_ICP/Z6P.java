package Practice_ques_01_ICP;

public class Z6P {
    public static void main(String[] args) {
        int x = - 4;
        System.out.println(x>>1);
        int y = 4;
        System.out.println(y>>1);
    /*
        x=-4
        in bits
        x= 0000 0000 0000 0000 0000 0000 0000 0100
         -x=1111 1111 1111 1111 1111 1111 1111 1100  //start from back
        x>>1  ----> i.e x shift shift 1
              ----> so
       -4>>1=1111 1111 1111 1111 1111 1111 1111 1110
       2's complement=0000 0000 0000 0000 0000 0000 0000 0010
       in decimal 10 is -2



       x=4;
       in bits
       x= 0000 0000 0000 0000 0000 0000 0000 0100
     x>>1=0000 0000 0000 0000 0000 0000 0000 0010
     in decimal= 2





     */
    }
}
