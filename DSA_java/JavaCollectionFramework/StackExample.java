import java.util.*;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        System.out.println("1) push(E) — pushes items on top (LIFO)");
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println(stack);
        // [Apple, Banana, Cherry]

        System.out.println("\n2) peek() — show top element");
        System.out.println("Top element: " + stack.peek());
        // Cherry

        System.out.println("\n3) pop() — removes and returns top");
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack);
        // [Apple, Banana]

        System.out.println("\n4) search(Object) — 1-based index from TOP");
        // Top is Banana
        System.out.println("search Banana: " + stack.search("Banana"));
        // 1 → top

        System.out.println("search Apple: " + stack.search("Apple"));
        // 2 → second from top

        System.out.println("search Unknown: " + stack.search("Mango"));
        // -1 → not found

        System.out.println("\n5) empty() — check if stack is empty");
        System.out.println("Is empty: " + stack.empty());

        System.out.println("\n6) Using inherited Vector methods: add, remove, size, iterator");
        stack.add("Dates");
        System.out.println("After add(): " + stack);

        stack.remove("Apple");
        System.out.println("After remove(): " + stack);

        System.out.println("Size: " + stack.size());

        System.out.println("\n7) Iterating stack (bottom to top):");
        for (String s : stack) System.out.println("Item: " + s);

        System.out.println("\n8) Final pop until empty:");
        while (!stack.empty()) {
            System.out.println("Pop: " + stack.pop());
        }

        System.out.println("After clearing: " + stack);
        // []
    }
}
