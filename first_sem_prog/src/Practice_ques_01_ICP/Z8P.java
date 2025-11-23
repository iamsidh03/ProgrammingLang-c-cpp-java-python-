package Practice_ques_01_ICP;

public class Z8P {
    public static void main(String[] args) {
        byte b = 10;
        //b=b+10; //gives error b is byte so we can't add byte and integer
        b = (byte) (b + (10));  //so after type to byte it no error it will print 20.
        System.out.println(b);
    }
}
