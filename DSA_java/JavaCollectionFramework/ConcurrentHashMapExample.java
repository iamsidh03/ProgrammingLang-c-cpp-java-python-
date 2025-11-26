import java.util.*;
import java.util.concurrent.*;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {

        System.out.println("=== 1) BASIC PUT, GET, REMOVE ===");

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("Apple", 100);
        map.put("Banana", 200);
        map.put("Cherry", 300);

        System.out.println("Map: " + map);
        System.out.println("get(Banana): " + map.get("Banana"));

        map.remove("Cherry");
        System.out.println("After remove: " + map);



        System.out.println("\n=== 2) putIfAbsent() (Atomic) ===");
        map.putIfAbsent("Banana", 999);  // won't replace
        map.putIfAbsent("Dates", 400);   // added
        System.out.println(map);



        System.out.println("\n=== 3) replace() ===");
        map.replace("Apple", 111);
        map.replace("Banana", 200, 222); // replace only if matches old value
        System.out.println(map);



        System.out.println("\n=== 4) compute(), computeIfAbsent(), computeIfPresent() ===");

        // compute
        map.compute("Apple", (k,v) -> v + 10);
        System.out.println("After compute: " + map);

        // computeIfAbsent
        map.computeIfAbsent("Elderberry", k -> 500);
        System.out.println("After computeIfAbsent: " + map);

        // computeIfPresent
        map.computeIfPresent("Dates", (k,v) -> v + 5);
        System.out.println("After computeIfPresent: " + map);



        System.out.println("\n=== 5) merge() (Atomic Combine) ===");
        map.merge("Banana", 50, (oldV,newV) -> oldV + newV);
        System.out.println(map);



        System.out.println("\n=== 6) keySet, values, entrySet (weakly consistent) ===");
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        System.out.println("EntrySet:");
        for (Map.Entry<String,Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }



        System.out.println("\n=== 7) THREAD-SAFE DEMO (Multi-thread updates) ===");

        ConcurrentHashMap<String, Integer> threadMap = new ConcurrentHashMap<>();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                threadMap.merge("count", 1, Integer::sum);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start(); t2.start(); t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {}

        System.out.println("Final count (should be 3000): " + threadMap.get("count"));



        System.out.println("\n=== 8) clear() ===");
        map.clear();
        System.out.println("After clear: " + map);
    }
}
