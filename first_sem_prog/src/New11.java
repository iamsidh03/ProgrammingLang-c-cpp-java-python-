public class New11 {

    public boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        String revStr = new StringBuilder(str).reverse().toString();
        return str.equals(revStr);
    }

    public int sumOfPalindromes(int nums) {
        int res = 0;
        for (int n = 0; n < nums; n++) {
            if (isPalindrome(n)) {
                res += n;
            }
        }
        return res;
    }



    public static void main(String[] args) {
        New11 obj = new New11();
        System.out.println(obj.sumOfPalindromes(1111));
    }
}

