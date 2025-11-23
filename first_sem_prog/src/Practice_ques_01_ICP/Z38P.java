package Practice_ques_01_ICP;

public class Z38P {
    public static void main(String[] args) {
        int a=12+21*3-9/2; //12+63-4-->71
        System.out.println(a);
        int b=14-32*4+175/8-3; //14-128+21-3------->-96
        System.out.println(b);
        boolean p=(++a>71&&--b<20); //true&&true----->
        System.out.println(p); //true
        boolean p1=(b-- == -99 || a-- > 100); //f || f----->f
        System.out.println(p1);

    }
}
