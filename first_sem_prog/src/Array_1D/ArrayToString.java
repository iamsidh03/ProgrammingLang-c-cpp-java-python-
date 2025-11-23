package Array_1D;

import java.util.Arrays;

public class ArrayToString {
    public static String toString(int[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }
    public static void main(String[] args) {
        int []arr = {5,84,544,87,57};
      //  System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));

    }
}
