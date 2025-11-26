import java.util.*;

public class SortedSetExample {
    public static void main(String[] args) {

        // TreeSet implements SortedSet (and NavigableSet)
        SortedSet<Integer> set = new TreeSet<>();

        System.out.println("1) add()");
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(70);
        set.add(60);
        System.out.println(set);
        // [10, 30, 50, 60, 70]

        System.out.println("\n2) comparator()");
        System.out.println("Comparator: " + set.comparator());
        // null means natural ordering is used

        System.out.println("\n3) first()");
        System.out.println("First element: " + set.first());
        // 10

        System.out.println("\n4) last()");
        System.out.println("Last element: " + set.last());
        // 70

        System.out.println("\n5) headSet(E)");
        SortedSet<Integer> head = set.headSet(50);
        System.out.println("headSet(50): " + head);
        // elements < 50 → [10, 30]

        System.out.println("\n6) tailSet(E)");
        SortedSet<Integer> tail = set.tailSet(50);
        System.out.println("tailSet(50): " + tail);
        // elements >= 50 → [50, 60, 70]

        System.out.println("\n7) subSet(from, to)");
        SortedSet<Integer> sub = set.subSet(30, 70);
        System.out.println("subSet(30, 70): " + sub);
        // elements >= 30 AND < 70 → [30, 50, 60]
    }
}
