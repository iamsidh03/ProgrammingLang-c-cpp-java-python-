import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        System.out.println("1) add(E) — maintains insertion order");
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // duplicate ignored
        System.out.println(set);
        // [Apple, Banana, Cherry]

        System.out.println("\n2) addAll(Collection)");
        set.addAll(Arrays.asList("Dates", "Elderberry", "Banana"));
        System.out.println(set);
        // [Apple, Banana, Cherry, Dates, Elderberry]

        System.out.println("\n3) contains()");
        System.out.println("Contains Cherry? " + set.contains("Cherry"));

        System.out.println("\n4) containsAll()");
        System.out.println("Contains Apple & Banana? " +
                set.containsAll(Arrays.asList("Apple", "Banana")));

        System.out.println("\n5) size(), isEmpty()");
        System.out.println("Size: " + set.size());
        System.out.println("isEmpty: " + set.isEmpty());

        System.out.println("\n6) remove(Object)");
        set.remove("Dates");
        System.out.println(set);

        System.out.println("\n7) removeAll(Collection)");
        set.removeAll(Arrays.asList("Apple"));
        System.out.println(set);

        System.out.println("\n8) retainAll(Collection)");
        set.retainAll(Arrays.asList("Banana", "Cherry"));
        System.out.println(set);

        System.out.println("\n9) toArray()");
        Object[] arr = set.toArray();
        System.out.println(Arrays.toString(arr));

        System.out.println("\n10) iterator() — maintains order");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) System.out.println("Iter: " + it.next());

        System.out.println("\n11) forEach()");
        set.forEach(item -> System.out.println("ForEach: " + item));

        System.out.println("\n12) spliterator()");
        Spliterator<String> sp = set.spliterator();
        sp.forEachRemaining(item -> System.out.println("Split: " + item));

        System.out.println("\n13) clear()");
        set.clear();
        System.out.println("After clear(): " + set);
    }
}
