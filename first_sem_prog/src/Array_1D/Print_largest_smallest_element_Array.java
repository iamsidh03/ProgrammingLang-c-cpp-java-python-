package Array_1D;

public class Print_largest_smallest_element_Array {




        public static int getlargest(int numbers[]) {
            int largest = Integer.MIN_VALUE;//-infinity
            int smallest = Integer.MAX_VALUE;
            for (int i = 0; i < numbers.length; i++) {
                if (largest < numbers[i]) {
                    largest = numbers[i];
                }
                if(smallest > numbers[i]){
                    smallest = numbers[i];
                }


            }
            System.out.println("smallest value is : "+ smallest);
            return largest;
        }

        public static void main(String[] args) {
            int numbers[]= {1,25,55,221};//we have to print largest value

            System.out.println("Largest value is : "+ getlargest(numbers));
        }


    }


