import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        System.out.println("1) add(E) — automatically sorted");
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(70);
        set.add(60);
        System.out.println(set);
        // [10, 30, 50, 60, 70]

        System.out.println("\n2) contains(), containsAll()");
        System.out.println(set.contains(30)); // true
        System.out.println(set.containsAll(Arrays.asList(10, 60))); // true

        System.out.println("\n3) remove() & removeAll()");
        set.remove(70);
        System.out.println(set);
        set.removeAll(Arrays.asList(10));
        System.out.println(set);

        System.out.println("\n4) first(), last()");
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        System.out.println("\n5) comparator()");
        System.out.println("Comparator used: " + set.comparator());
        // null = natural ordering

        System.out.println("\n6) headSet(toElement)");
        System.out.println("headSet(50): " + set.headSet(50));
        // [30]

        System.out.println("\n7) tailSet(fromElement)");
        System.out.println("tailSet(30): " + set.tailSet(30));
        // [30, 50, 60]

        System.out.println("\n8) subSet(from, to)");
        System.out.println("subSet(30, 60): " + set.subSet(30, 60));
        // [30, 50]

        /* ---------------- NavigableSet Methods ---------------- */

        System.out.println("\n9) lower(E)  (<E)");
        System.out.println("lower(50): " + set.lower(50)); // 30

        System.out.println("\n10) floor(E)  (<=E)");
        System.out.println("floor(50): " + set.floor(50)); // 50
        System.out.println("floor(40): " + set.floor(40)); // 30

        System.out.println("\n11) ceiling(E)  (>=E)");
        System.out.println("ceiling(50): " + set.ceiling(50)); // 50
        System.out.println("ceiling(55): " + set.ceiling(55)); // 60

        System.out.println("\n12) higher(E)  (>E)");
        System.out.println("higher(50): " + set.higher(50)); // 60

        System.out.println("\n13) pollFirst() & pollLast()");
        System.out.println("pollFirst(): " + set.pollFirst()); // removes 30
        System.out.println("pollLast(): " + set.pollLast());   // removes 60
        System.out.println("After polls: " + set);

        /* Add back elements for more methods */
        set.add(30);
        set.add(60);

        System.out.println("\n14) descendingSet()");
        System.out.println(set.descendingSet());
        // [60, 50, 30]

        System.out.println("\n15) descendingIterator()");
        Iterator<Integer> descIt = set.descendingIterator();
        while (descIt.hasNext()) System.out.println("Desc: " + descIt.next());

        System.out.println("\n16) headSet(to, inclusive)");
        System.out.println(set.headSet(50, true));

        System.out.println("\n17) tailSet(from, inclusive)");
        System.out.println(set.tailSet(50, false));

        System.out.println("\n18) subSet(from, true, to, false)");
        System.out.println(set.subSet(30, true, 60, false));

        System.out.println("\n19) iterator()");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) System.out.println("Iter: " + it.next());

        System.out.println("\n20) toArray()");
        System.out.println(Arrays.toString(set.toArray()));

        System.out.println("\n21) clear()");
        set.clear();
        System.out.println("After clear(): " + set);
    }
}
