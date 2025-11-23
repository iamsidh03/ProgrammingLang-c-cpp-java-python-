package Binary_search;

public class BS_Array {
    public static void main(String[] args) {
        int []arr={1,2,3,4,6,8,71,98,1002};
        int target=1002;
        System.out.println(" USING WHILE LOOP  "+BS(arr,target));
        System.out.println(" USING FOR LOOP    "+BS_For(arr,target));

    }
    static int BS(int []arr,int target){
       int start=0;
       int end =arr.length-1;
       while(start<=end){
           int mid =start+(end-start)/2;
           if (target>arr[mid]){
               start=mid+1;
           }
           else if (target<arr[mid]){
               end =mid-1;
           }
           else
               return mid;
       }
       return -1;
    }
    //using for loop
    static int BS_For(int arr[],int target){
        int start=0;
        int end =arr.length -1;
        for (int i = start; i <end; i++) {
            int mid = start+(end-start)/2;
            if (target>arr[mid]){
                start =mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else
                return mid;
        }
        return -1;
    }
}
