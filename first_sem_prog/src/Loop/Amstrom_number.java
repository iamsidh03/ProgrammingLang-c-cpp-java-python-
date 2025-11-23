package Loop;

public class Amstrom_number {
    static String armstrongNumber(int n) {
        int num = 1, cube, sum = 0;
        while (n != 0) {
            num = n % 10;
            cube = (int) Math.pow(num, 3);
            sum += cube;
            n /= 10;
        }
        if (n == sum) {
            System.out.println("Yes");
        } else {
        }
        System.out.println("no");
        return "no";
    }




    public static void main(String[] args) {
        armstrongNumber(153);
    }
}
