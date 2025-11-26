import java.util.*;

public class VectorExample {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>(2); // initial capacity 2

        System.out.println("1) addElement(), add()");
        vector.addElement("Apple");
        vector.add("Banana");
        vector.add("Cherry");  // capacity grows automatically
        System.out.println(vector);
        // [Apple, Banana, Cherry]

        System.out.println("\n2) capacity()");
        System.out.println("Capacity: " + vector.capacity());

        System.out.println("\n3) add(index,E) & insertElementAt()");
        vector.add(1, "Inserted");
        vector.insertElementAt("Mango", 2);
        System.out.println(vector);

        System.out.println("\n4) get(int), set(int,E)");
        System.out.println("get(2): " + vector.get(2));
        vector.set(2, "Updated");
        System.out.println(vector);

        System.out.println("\n5) firstElement(), lastElement()");
        System.out.println("firstElement: " + vector.firstElement());
        System.out.println("lastElement: " + vector.lastElement());

        System.out.println("\n6) indexOf(), lastIndexOf()");
        vector.add("Apple");
        System.out.println("indexOf Apple: " + vector.indexOf("Apple"));
        System.out.println("lastIndexOf Apple: " + vector.lastIndexOf("Apple"));

        System.out.println("\n7) remove(), removeElement(), removeElementAt()");
        vector.remove("Inserted");
        vector.removeElement("Apple");
        vector.removeElementAt(1);
        System.out.println(vector);

        System.out.println("\n8) removeAll(), retainAll()");
        vector.add("X");
        vector.add("Y");
        vector.removeAll(Arrays.asList("X"));
        System.out.println(vector);
        vector.retainAll(Arrays.asList("Updated"));
        System.out.println(vector);

        System.out.println("\n9) ensureCapacity()");
        vector.ensureCapacity(10);
        System.out.println("Capacity after ensureCapacity: " + vector.capacity());

        System.out.println("\n10) trimToSize()");
        vector.trimToSize();
        System.out.println("Capacity after trimToSize: " + vector.capacity());

        System.out.println("\n11) toArray()");
        System.out.println(Arrays.toString(vector.toArray()));

        System.out.println("\n12) elements() — Legacy Enumerator");
        vector.add("New");
        Enumeration<String> en = vector.elements();
        while (en.hasMoreElements()) {
            System.out.println("Enum: " + en.nextElement());
        }

        System.out.println("\n13) iterator()");
        for (String s : vector) System.out.println("Iter: " + s);

        System.out.println("\n14) size(), isEmpty()");
        System.out.println("Size: " + vector.size());
        System.out.println("isEmpty: " + vector.isEmpty());

        System.out.println("\n15) clear()");
        vector.clear();
        System.out.println("After clear: " + vector);
    }
}
