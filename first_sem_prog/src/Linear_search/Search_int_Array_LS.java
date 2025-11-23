package Linear_search;

public class Search_int_Array_LS {


        public static void main(String[] args) {
            int []num = {1,15,156,1548,848,646,32,848,883};
            int target =1555;
            int ans =linearSearch(num,target);
            System.out.println(target+" found at index "+ans);
        }
        static int linearSearch(int []arr, int target){
            if (arr.length==0){
                return -1;//if length of array is zero
            }
            for (int index = 0; index < arr.length; index++) {
                int element =arr[index];
                if (element ==target){
                    return index;
                }
            }
            return -1;//this will execute if element entered not in array
        }
    }


