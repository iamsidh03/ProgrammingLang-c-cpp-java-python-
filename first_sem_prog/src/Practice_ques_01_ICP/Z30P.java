package Practice_ques_01_ICP;

public class Z30P {
    public static void main(String[] args) {
        int v=10;//
        System.out.println(v%=3*4);//v=v%3*4--->(*>%)----->10%12=10
        int x=11;
        System.out.println(-x--);//-11
        System.out.println(x);//10
        x = -x--;
        System.out.println(x);//-10
        int y = -x--;
        System.out.println(x+""+y);//
    }
}
