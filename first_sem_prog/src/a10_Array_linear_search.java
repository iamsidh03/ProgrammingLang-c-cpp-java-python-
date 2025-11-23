//LINEAR SEARCH
// FIND NUMBER IN KEY LIST AND GIVE INDEX OF ARRAY
public class a10_Array_linear_search {
    public static int linearSearch(int numbers[],int key) {
        for (int i = 0; i<numbers.length; i ++){
            if(numbers[i]==key){
                return i;
            }

        }
        return -1;
    }



    public static void main(String[] args) {
        int number[]= {2, 5, 4,6,84,46,6,48,51,51,1,41,10};
        int key = 51;
        int index = linearSearch(number,key);
        if(index ==-1){
            System.out.println("NOT FOUND");

        }
        else {
            System.out.println("key is at index : " +index);
        }

    }
}
