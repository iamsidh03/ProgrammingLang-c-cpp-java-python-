package Practice_ques_01_ICP;

public class Z37P {
    public static void main(String[] args) {
        int x=20;
        String sup = (x < 15) ? "small" : (x < 22)? "tiny" : "huge";// (x<15) false so check (x<22) true so print tiny------>ternary operator
        System.out.println(sup);
    }
}
