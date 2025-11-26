import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {

        // Creating a Collection (ArrayList implements Collection)
        Collection<String> collection = new ArrayList<>();

        System.out.println("1) add(E e)");
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Cherry");
        System.out.println(collection);

        System.out.println("\n2) addAll(Collection)");
        Collection<String> extra = Arrays.asList("Dates", "Elderberry");
        collection.addAll(extra);
        System.out.println(collection);

        System.out.println("\n3) contains(Object)");
        System.out.println("Contains 'Banana'? " + collection.contains("Banana"));

        System.out.println("\n4) containsAll(Collection)");
        System.out.println("Contains all [Apple, Cherry]? " +
                collection.containsAll(Arrays.asList("Apple", "Cherry")));

        System.out.println("\n5) size()");
        System.out.println("Size: " + collection.size());

        System.out.println("\n6) isEmpty()");
        System.out.println("Is empty? " + collection.isEmpty());

        System.out.println("\n7) remove(Object)");
        collection.remove("Dates");
        System.out.println(collection);

        System.out.println("\n8) removeAll(Collection)");
        collection.removeAll(Arrays.asList("Apple", "Banana"));
        System.out.println(collection);

        System.out.println("\n9) retainAll(Collection)");
        collection.retainAll(Arrays.asList("Cherry", "Elderberry"));
        System.out.println(collection);

        System.out.println("\n10) toArray()");
        Object[] arr = collection.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        System.out.println("\n11) toArray(T[])");
        String[] arr2 = collection.toArray(new String[0]);
        System.out.println("Typed Array: " + Arrays.toString(arr2));

        System.out.println("\n12) iterator()");
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\n13) forEach()");
        collection.forEach(item -> System.out.println(item));

        System.out.println("\n14) spliterator()");
        Spliterator<String> sp = collection.spliterator();
        sp.forEachRemaining(item -> System.out.println(item));

        System.out.println("\n15) clear()");
        collection.clear();
        System.out.println("After clear(): " + collection);
        System.out.println("Size now: " + collection.size());
    }
}
