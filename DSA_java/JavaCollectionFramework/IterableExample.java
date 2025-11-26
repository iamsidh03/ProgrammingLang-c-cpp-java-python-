import java.util.*;
import java.util.function.Consumer;

public class IterableExample {
    public static void main(String[] args) {

        // Any class that implements Iterable (ArrayList, HashSet, etc)
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("1) Using iterator():");
        Iterator<String> it = list.iterator();   // Iterable method
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\n2) Using forEach(Consumer):");
        list.forEach(new Consumer<String>() {    // Iterable default method
            @Override
            public void accept(String item) {
                System.out.println(item);
            }
        });

        System.out.println("\n3) Using spliterator():");
        Spliterator<String> sp = list.spliterator();   // Iterable default method
        sp.forEachRemaining((item) -> System.out.println(item));
    }
}
