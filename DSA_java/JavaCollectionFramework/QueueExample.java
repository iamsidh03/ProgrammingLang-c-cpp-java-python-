import java.util.*;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        System.out.println("1) add(E)");
        q.add("Apple");
        q.add("Banana");
        q.add("Cherry");
        System.out.println(q);
        // [Apple, Banana, Cherry]

        System.out.println("\n2) offer(E)");
        q.offer("Dates");
        System.out.println(q);
        // [Apple, Banana, Cherry, Dates]

        System.out.println("\n3) element()  -> head, exception if empty");
        System.out.println("Head element(): " + q.element());
        // Apple

        System.out.println("\n4) peek()  -> head, null if empty");
        System.out.println("Head peek(): " + q.peek());
        // Apple

        System.out.println("\n5) remove()  -> remove head, exception if empty");
        System.out.println("Removed: " + q.remove());
        System.out.println(q);
        // removes Apple → [Banana, Cherry, Dates]

        System.out.println("\n6) poll()  -> remove head, null if empty");
        System.out.println("Polled: " + q.poll());
        System.out.println(q);
        // removes Banana → [Cherry, Dates]

        System.out.println("\n7) poll() until queue becomes empty");
        q.poll(); // Cherry
        q.poll(); // Dates
        System.out.println("After clearing: " + q);
        // []

        System.out.println("\n8) peek() on empty queue");
        System.out.println("Peek empty: " + q.peek());
        // null

        System.out.println("\n9) remove() on empty queue (will throw exception)");
        try {
            q.remove(); // throws NoSuchElementException
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
