import java.util.Scanner;
import java.util.ArrayList;
public class Array_list {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 4; i++) { //size of an outer array
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {  //number of inner array
            for (int j = 0; j < 2; j++) { //number of pair form
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
