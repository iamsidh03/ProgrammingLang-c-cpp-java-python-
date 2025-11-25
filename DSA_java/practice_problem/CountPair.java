import java.util.*;
/* 
Given an array and a target sum k, count how many pairs (i, j) exist such that
arr[i] + arr[j] == k and i < j.
*/

public class CountPair {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, -1, 5 };
        int k = 6;
        System.out.println(countPair(arr, k)); // Output: 3

    }

    public static int countPair(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int freq = 0;
        for (int x : arr) {
            int comp = k - x;
            if (map.containsKey(comp)) {
                freq++;
            }
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        return freq;
    }

}
