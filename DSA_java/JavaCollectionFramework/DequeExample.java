import java.util.*;

public class DequeExample {
    public static void main(String[] args) {

        Deque<String> dq = new ArrayDeque<>();

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
        // First: Start, Last: End

        System.out.println("\n4) peekFirst(), peekLast()");
        System.out.println("Peek First: " + dq.peekFirst());
        System.out.println("Peek Last: " + dq.peekLast());
        // Peek First: Start, Peek Last: End

        System.out.println("\n5) removeFirst(), removeLast()");
        dq.removeFirst(); // removes Start
        dq.removeLast();  // removes End
        System.out.println(dq);
        // [Apple, Banana, Cherry]

        System.out.println("\n6) pollFirst(), pollLast()");
        dq.pollFirst(); // removes Apple
        dq.pollLast();  // removes Cherry
        System.out.println(dq);
        // [Banana]

        System.out.println("\n7) Stack operations (push, pop, peek)");
        dq.push("Orange");  // addFirst
        dq.push("Grapes");
        System.out.println(dq);
        // [Grapes, Orange, Banana]

        System.out.println("Stack pop(): " + dq.pop()); // removeFirst
        System.out.println(dq);
        // [Orange, Banana]

        System.out.println("Stack peek(): " + dq.peek()); // peekFirst
        // Orange

        System.out.println("\n8) Clearing and poll on empty deque");
        dq.clear();
        System.out.println("After clear(): " + dq); // []
        System.out.println("pollFirst(): " + dq.pollFirst()); // null
        System.out.println("pollLast(): " + dq.pollLast());   // null

        System.out.println("\n9) removeFirst() on empty deque (exception)");
        try {
            dq.removeFirst();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
