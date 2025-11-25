import java.util.*;



public class Second_Largest_Element {
    public static void main(String[] args) {
        // int []arr={10,9,8,10,-1,100,99,-99};
        // int[] arr = { -99, -99 };
        int []arr={3,5,2,1,5,7,88,90};
        int ans = secondlargest(arr);
        int thirdmax = ThirdLargest(arr);
        int nthlargest=nlargest(arr, 7);
        System.out.println("second largest " + ans);
        System.out.println("Third largest " + thirdmax);
        System.out.println("nth  largest " + nthlargest);
    }

    public static int secondlargest(int[] arr) {

        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (fmax < arr[i]) {
                smax = fmax;
                fmax = arr[i];
            } else if (arr[i] > smax && arr[i] != fmax) {
                smax = arr[i];
            }
        }
        return smax;
    }

    public static int ThirdLargest(int[] arr) {
        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (fmax < arr[i]) {
                tmax = smax;
                smax = fmax;
                fmax = arr[i];
            } else if (arr[i] > smax && arr[i] != fmax) {
                tmax = smax;
                smax = arr[i];
            } else if (arr[i] > tmax && arr[i] != smax && arr[i] != fmax) {
                tmax = arr[i];
            }
        }
        if (tmax == Integer.MIN_VALUE) {
            throw new RuntimeException("No valid third largest element!");
        }

        return tmax;
    }
    public static int nlargest(int []arr,int n){
        /* 
        approach is sort + set
        TreeSet is best data structure that stored unique element in sorted order.
        */
       TreeSet<Integer> st=new TreeSet<>();
       for(int i:arr){
        st.add(i);
       }
       if(n>st.size()){
        throw new IllegalArgumentException("Not enough distinf element");
       }
       //convert set into array list 
       ArrayList<Integer> l=new ArrayList<>(st);
       
       return l.get(l.size()-n);

    }

}
