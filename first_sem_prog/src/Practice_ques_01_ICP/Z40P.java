package Practice_ques_01_ICP;

public class Z40P {
    public static void main(String[] args) {
        float x=5.3f;
        boolean p=(x==5.3);
        //boolean by default take double value
        //here, x is in float data type
        //output will be false


        // boolean q=((int)(x==5.3));
        //gives error because can't convert boolean int int data type

        System.out.println(p);
    }
}
