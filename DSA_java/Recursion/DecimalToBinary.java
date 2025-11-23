//package Recursion;
 class DecimalToBinary {
    public static void main(String[] args) {
        int n = 100;
        decToBinary(n);
    }
    static void decToBinary(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[1000];
 
        // counter for binary array
        int i = 0;
        while (n > 0) 
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
 
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
/*
public static int reverse(int rem){
    int rev=0;
    while(rem!=0){
        int lastDigit = rem%10;
        rev = rev*10+lastDigit;
        rem/=10;

    }
    return rev;
}
     */
}
