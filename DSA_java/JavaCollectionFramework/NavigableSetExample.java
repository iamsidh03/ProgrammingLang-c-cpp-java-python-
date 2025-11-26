import java.util.*;

public class NavigableSetExample {
    public static void main(String[] args) {

        NavigableSet<Integer> set = new TreeSet<>();

        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println("Initial Set: " + set);
        // [10, 20, 30, 40, 50]

        System.out.println("\n1) lower(E)  -> < E");
        System.out.println("lower(30): " + set.lower(30));
        // 20

        System.out.println("\n2) floor(E)  -> <= E");
        System.out.println("floor(30): " + set.floor(30));
        // 30
        System.out.println("floor(25): " + set.floor(25));
        // 20

        System.out.println("\n3) ceiling(E) -> >= E");
        System.out.println("ceiling(30): " + set.ceiling(30));
        // 30
        System.out.println("ceiling(35): " + set.ceiling(35));
        // 40

        System.out.println("\n4) higher(E) -> > E");
        System.out.println("higher(30): " + set.higher(30));
        // 40

        System.out.println("\n5) pollFirst()  -> removes smallest");
        System.out.println("pollFirst(): " + set.pollFirst());
        System.out.println("After pollFirst: " + set);
        // removes 10 → [20, 30, 40, 50]

        System.out.println("\n6) pollLast()   -> removes largest");
        System.out.println("pollLast(): " + set.pollLast());
        System.out.println("After pollLast: " + set);
        // removes 50 → [20, 30, 40]

        System.out.println("\n7) descendingSet() -> reverse order");
        NavigableSet<Integer> desc = set.descendingSet();
        System.out.println("Descending: " + desc);
        // [40, 30, 20]

        System.out.println("\n8) descendingIterator()");
        Iterator<Integer> it = set.descendingIterator();
        while (it.hasNext()) {
            System.out.println("Iter: " + it.next());
        }

        System.out.println("\n9) subSet(from, true, to, false)");
        NavigableSet<Integer> subset = set.subSet(20, true, 40, false);
        System.out.println("subSet(20,true,40,false): " + subset);
        // [20, 30]

        System.out.println("\n10) headSet(toElement, inclusive)");
        System.out.println("headSet(30, true): " + set.headSet(30, true));
        // [20, 30]

        System.out.println("\n11) tailSet(fromElement, inclusive)");
        System.out.println("tailSet(30, false): " + set.tailSet(30, false));
        // [40]
    }
}
