public class a11_Array_binarySearch {
    public static int binarySearch(int number[],int key) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            //comparision
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) { //right
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int number[] = {45,55,55,78,1,25,45};
        int key =78;
        System.out.println("index for key is : " + binarySearch( number,key));

    }
}
