import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        // HashSet implements Set
        Set<String> set = new HashSet<>();

        System.out.println("1) add(E)");
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // duplicate
        System.out.println(set);
        // Duplicate "Apple" will NOT be added

        System.out.println("\n2) addAll(Collection)");
        set.addAll(Arrays.asList("Dates", "Elderberry", "Banana"));
        System.out.println(set);
        // "Banana" duplicate ignored

        System.out.println("\n3) contains(Object)");
        System.out.println("Contains 'Cherry'? " + set.contains("Cherry"));

        System.out.println("\n4) containsAll(Collection)");
        System.out.println("Contains all [Apple, Dates]? " +
                set.containsAll(Arrays.asList("Apple", "Dates")));

        System.out.println("\n5) size()");
        System.out.println("Size: " + set.size());

        System.out.println("\n6) isEmpty()");
        System.out.println("Is empty? " + set.isEmpty());

        System.out.println("\n7) remove(Object)");
        set.remove("Dates");
        System.out.println(set);

        System.out.println("\n8) removeAll(Collection)");
        set.removeAll(Arrays.asList("Apple", "Unknown"));
        System.out.println(set);

        System.out.println("\n9) retainAll(Collection)");
        set.retainAll(Arrays.asList("Cherry", "Banana"));
        System.out.println(set);

        System.out.println("\n10) toArray()");
        Object[] arr = set.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        System.out.println("\n11) iterator()");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println("Item: " + it.next());
        }

        System.out.println("\n12) forEach()");
        set.forEach(item -> System.out.println("ForEach: " + item));

        System.out.println("\n13) spliterator()");
        Spliterator<String> sp = set.spliterator();
        sp.forEachRemaining(item -> System.out.println("Split: " + item));

        System.out.println("\n14) clear()");
        set.clear();
        System.out.println("After clear(): " + set);
        System.out.println("Size now: " + set.size());
    }
}
