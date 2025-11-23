package Practice_ques_01_ICP;

public class Z26P {
    public static void main(String[] args) {
        int i = 132;
        short s = 15;
        byte b = (byte) i; //range of byte is(-128 to 1270--->132 is out of the range of byte
        int x = b + s;
        System.out.println("Value of x is " + x);
    }
}
