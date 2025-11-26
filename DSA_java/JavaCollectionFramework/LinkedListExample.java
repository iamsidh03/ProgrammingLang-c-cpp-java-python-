import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        System.out.println("1) add(E), add(index,E)");
        list.add("Apple");
        list.add("Banana");
        list.add(1, "Inserted");
        System.out.println(list);
        // [Apple, Inserted, Banana]

        System.out.println("\n2) get(int), set(int,E)");
        System.out.println("get(1): " + list.get(1));
        list.set(1, "Cherry");
        System.out.println(list);
        // [Apple, Cherry, Banana]

        System.out.println("\n3) remove(int)");
        list.remove(2);
        System.out.println(list);
        // [Apple, Cherry]

        System.out.println("\n4) indexOf(), lastIndexOf()");
        list.add("Apple");
        System.out.println("indexOf Apple: " + list.indexOf("Apple"));
        System.out.println("lastIndexOf Apple: " + list.lastIndexOf("Apple"));

        System.out.println("\n5) listIterator()");
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) System.out.println("Iter: " + it.next());

        System.out.println("\n6) subList(0,2)");
        System.out.println(list.subList(0, 2));
        // [Apple, Cherry]

        /* -------------------- QUEUE METHODS -------------------- */

        System.out.println("\n7) QUEUE: add(E), offer(E)");
        list.add("X");
        list.offer("Y");
        System.out.println(list);
        // [Apple, Cherry, Apple, X, Y]

        System.out.println("\n8) QUEUE: element(), peek()");
        System.out.println("element(): " + list.element());
        System.out.println("peek(): " + list.peek());
        // Both return first element (Apple)

        System.out.println("\n9) QUEUE: remove(), poll()");
        System.out.println("remove(): " + list.remove());
        System.out.println("poll(): " + list.poll());
        System.out.println(list);
        // removes 2 elements

        /* -------------------- DEQUE METHODS -------------------- */

        System.out.println("\n10) DEQUE: addFirst(), addLast()");
        list.addFirst("Start");
        list.addLast("End");
        System.out.println(list);

        System.out.println("\n11) DEQUE: offerFirst(), offerLast()");
        list.offerFirst("Begin");
        list.offerLast("Finish");
        System.out.println(list);

        System.out.println("\n12) DEQUE: getFirst(), getLast()");
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        System.out.println("\n13) DEQUE: peekFirst(), peekLast()");
        System.out.println("peekFirst: " + list.peekFirst());
        System.out.println("peekLast: " + list.peekLast());

        System.out.println("\n14) DEQUE: removeFirst(), removeLast()");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        System.out.println("\n15) DEQUE: pollFirst(), pollLast()");
        list.pollFirst();
        list.pollLast();
        System.out.println(list);

        /* -------------------- STACK METHODS -------------------- */

        System.out.println("\n16) STACK: push(), pop(), peek()");
        list.push("Orange");   // addFirst
        list.push("Grapes");
        System.out.println(list);
        System.out.println("pop(): " + list.pop());
        System.out.println("peek(): " + list.peek());
        System.out.println(list);

        /* -------------------- COLLECTION METHODS -------------------- */

        System.out.println("\n17) contains(), containsAll()");
        System.out.println(list.contains("Orange"));
        System.out.println(list.containsAll(Arrays.asList("Orange", "Apple")));

        System.out.println("\n18) removeAll(), retainAll()");
        list.removeAll(Arrays.asList("Orange"));
        System.out.println(list);

        list.retainAll(Arrays.asList("Apple"));
        System.out.println(list);

        System.out.println("\n19) toArray()");
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        System.out.println("\n20) clear()");
        list.clear();
        System.out.println(list);
    }
}
