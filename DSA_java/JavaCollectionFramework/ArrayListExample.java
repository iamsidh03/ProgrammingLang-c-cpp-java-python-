import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        System.out.println("1) add(E) & add(index, E)");
        list.add("Apple");
        list.add("Banana");
        list.add(1, "Inserted");
        System.out.println(list);
        // [Apple, Inserted, Banana]

        System.out.println("\n2) get(int index)");
        System.out.println("Index 1: " + list.get(1));
        // Inserted

        System.out.println("\n3) set(int index, E)");
        list.set(1, "Cherry");
        System.out.println(list);
        // [Apple, Cherry, Banana]

        System.out.println("\n4) remove(int index)");
        list.remove(2);
        System.out.println(list);
        // [Apple, Cherry]

        System.out.println("\n5) indexOf() & lastIndexOf()");
        list.add("Apple");
        System.out.println("indexOf Apple: " + list.indexOf("Apple"));  
        System.out.println("lastIndexOf Apple: " + list.lastIndexOf("Apple"));

        System.out.println("\n6) addAll(Collection)");
        list.addAll(Arrays.asList("X", "Y"));
        System.out.println(list);

        System.out.println("\n7) contains() & containsAll()");
        System.out.println(list.contains("Cherry"));
        System.out.println(list.containsAll(Arrays.asList("Apple", "Cherry")));

        System.out.println("\n8) size() & isEmpty()");
        System.out.println("Size: " + list.size());
        System.out.println("isEmpty: " + list.isEmpty());

        System.out.println("\n9) removeAll() & retainAll()");
        list.removeAll(Arrays.asList("X"));
        System.out.println(list);
        // remove X

        list.retainAll(Arrays.asList("Apple", "Cherry"));
        System.out.println(list);
        // retains only Apple, Cherry

        System.out.println("\n10) toArray()");
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        System.out.println("\n11) listIterator()");
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            System.out.println("Iter: " + it.next());
        }

        System.out.println("\n12) subList()");
        List<String> sub = list.subList(0, 1);
        System.out.println("subList(0,1): " + sub);

        System.out.println("\n13) ensureCapacity()");
        ArrayList<Integer> numList = new ArrayList<>(2);
        numList.add(10);
        numList.add(20);
        numList.ensureCapacity(10);  // increases capacity
        System.out.println("ensureCapacity called");

        System.out.println("\n14) trimToSize()");
        numList.trimToSize(); // trims internal array to size
        System.out.println("trimToSize called");

        System.out.println("\n15) clear()");
        list.clear();
        System.out.println("After clear(): " + list);
    }
}
