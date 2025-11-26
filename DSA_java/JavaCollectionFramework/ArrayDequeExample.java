import java.util.*;

public class ArrayDequeExample {
    public static void main(String[] args) {

        ArrayDeque<String> dq = new ArrayDeque<>();

        System.out.println("1) addFirst(), addLast()");
        dq.addFirst("Banana");
        dq.addLast("Cherry");
        dq.addFirst("Apple");
        System.out.println(dq);
        // [Apple, Banana, Cherry]

        System.out.println("\n2) offerFirst(), offerLast()");
        dq.offerFirst("Start");
        dq.offerLast("End");
        System.out.println(dq);
        // [Start, Apple, Banana, Cherry, End]

        System.out.println("\n3) getFirst(), getLast()");
        System.out.println("First: " + dq.getFirst());
        System.out.println("Last: " + dq.getLast());

        System.out.println("\n4) peekFirst(), peekLast()");
        System.out.println("peekFirst: " + dq.peekFirst());
        System.out.println("peekLast: " + dq.peekLast());

        System.out.println("\n5) removeFirst(), removeLast()");
        dq.removeFirst(); // removes Start
        dq.removeLast();  // removes End
        System.out.println(dq);

        System.out.println("\n6) pollFirst(), pollLast()");
        dq.pollFirst(); // removes Apple
        dq.pollLast();  // removes Cherry
        System.out.println(dq); 
        // [Banana]

        /* ---------------- Stack Operations ---------------- */

        System.out.println("\n7) push(), pop(), peek()");
        dq.push("Orange");  // addFirst
        dq.push("Grapes");
        System.out.println(dq);
        System.out.println("pop(): " + dq.pop());
        System.out.println("peek(): " + dq.peek());
        System.out.println(dq);

        /* ---------------- Queue Operations ---------------- */

        ArrayDeque<Integer> q = new ArrayDeque<>();
        System.out.println("\n8) add(), offer()");
        q.add(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);

        System.out.println("\n9) element(), peek()");
        System.out.println("element(): " + q.element());
        System.out.println("peek(): " + q.peek());

        System.out.println("\n10) remove(), poll()");
        System.out.println("remove(): " + q.remove());
        System.out.println("poll(): " + q.poll());
        System.out.println(q);

        /* ---------------- Collection Methods ---------------- */

        System.out.println("\n11) contains()");
        System.out.println("Contains 30? " + q.contains(30));

        System.out.println("\n12) iterator()");
        for (Integer i : q) System.out.println("Iter: " + i);

        System.out.println("\n13) size(), isEmpty()");
        System.out.println("Size: " + q.size());
        System.out.println("isEmpty: " + q.isEmpty());

        System.out.println("\n14) clear()");
        q.clear();
        System.out.println("After clear: " + q);
    }
}
