import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {

        System.out.println("=== 1) MIN-HEAP PRIORITY QUEUE (Default) ===");

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Queue operations
        System.out.println("1) add(E)");
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        System.out.println("Internal Heap (unordered print): " + pq);
        // Not sorted when printing

        System.out.println("\n2) peek() & element()");
        System.out.println("peek(): " + pq.peek());       // smallest
        System.out.println("element(): " + pq.element()); // smallest

        System.out.println("\n3) poll() & remove()");
        System.out.println("poll(): " + pq.poll());       // removes 10
        System.out.println("Queue now: " + pq);
        System.out.println("remove(): " + pq.remove());   // removes next min
        System.out.println("Queue now: " + pq);

        System.out.println("\n4) offer()");
        pq.offer(5);
        System.out.println("After offer(5): " + pq);

        System.out.println("\n5) contains()");
        System.out.println("Contains 30? " + pq.contains(30));

        System.out.println("\n6) remove(Object)");
        pq.remove((Integer) 30);
        System.out.println("After removing 30: " + pq);

        System.out.println("\n7) toArray()");
        System.out.println(Arrays.toString(pq.toArray()));

        System.out.println("\n8) iterator() — not sorted");
        for (Integer i : pq) System.out.println("Iter: " + i);

        System.out.println("\n9) size(), isEmpty()");
        System.out.println("Size: " + pq.size());
        System.out.println("isEmpty: " + pq.isEmpty());

        System.out.println("\n10) clear()");
        pq.clear();
        System.out.println("After clear: " + pq);



        System.out.println("\n=== 2) MAX-HEAP PRIORITY QUEUE ===");

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(30);
        maxHeap.add(20);

        System.out.println("Max-Heap PQ: " + maxHeap);
        System.out.println("peek(): " + maxHeap.peek());  // 30



        System.out.println("\n=== 3) PRIORITY QUEUE WITH CUSTOM COMPARATOR ===");

        PriorityQueue<String> stringPQ =
                new PriorityQueue<>(Comparator.comparingInt(String::length));

        stringPQ.add("apple");
        stringPQ.add("kiwi");
        stringPQ.add("banana");

        System.out.println("String PQ (shortest first): " + stringPQ);
        System.out.println("poll(): " + stringPQ.poll()); // kiwi
        System.out.println("poll(): " + stringPQ.poll()); // apple
        System.out.println("poll(): " + stringPQ.poll()); // banana



        System.out.println("\n=== 4) CREATE PRIORITY QUEUE FROM COLLECTION ===");

        List<Integer> nums = Arrays.asList(5, 1, 4, 3, 2);
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(nums);
        System.out.println("PQ created from List: " + pq2);

        System.out.println("\nFinal poll outputs (sorted order):");
        while (!pq2.isEmpty()) {
            System.out.print(pq2.poll() + " ");
        }
    }
}
