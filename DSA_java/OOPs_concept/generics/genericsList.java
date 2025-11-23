package generics;

import java.util.*;

public class genericsList {
    public static void main(String[] args) {
        ourGenericList<Integer> list1 = new ourGenericList<>();
        list1.add(100);
        list1.add(122);
        list1.add(33);
        list1.add(344);
    //     Iterator<Integer> iterator = list1.iterator();
    //     while (iterator.hasNext()) {
    //         System.out.println(iterator.next());
    // }
    for(int i:list1){
        System.out.println(i);
        }
    }
}
