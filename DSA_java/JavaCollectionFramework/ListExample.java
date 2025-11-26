import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        // List interface reference
        List<String> list = new ArrayList<>();

        System.out.println("1) add(E), add(index, E)");
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add(1, "Inserted");
        System.out.println(list); 
        // [Apple, Inserted, Banana, Cherry]

        System.out.println("\n2) get(int index)");
        System.out.println(list.get(2)); 
        // Banana

        System.out.println("\n3) set(int index, E)");
        list.set(2, "Blueberry");
        System.out.println(list); 
        // [Apple, Inserted, Blueberry, Cherry]

        System.out.println("\n4) remove(int index)");
        list.remove(1);
        System.out.println(list); 
        // [Apple, Blueberry, Cherry]

        System.out.println("\n5) indexOf(Object)");
        System.out.println(list.indexOf("Cherry"));  
        // 2

        System.out.println("\n6) lastIndexOf(Object)");
        list.add("Apple");
        System.out.println(list); 
        // [Apple, Blueberry, Cherry, Apple]
        System.out.println(list.lastIndexOf("Apple"));  
        // 3

        System.out.println("\n7) listIterator()");
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            System.out.println("Next: " + it.next());
        }

        System.out.println("\n8) listIterator(int index)");
        ListIterator<String> it2 = list.listIterator(1);
        while (it2.hasNext()) {
            System.out.println("From index 1: " + it2.next());
        }

        System.out.println("\n9) subList(from, to)");
        List<String> sub = list.subList(1, 3);
        System.out.println(sub); 
        // [Blueberry, Cherry]
    }
}
