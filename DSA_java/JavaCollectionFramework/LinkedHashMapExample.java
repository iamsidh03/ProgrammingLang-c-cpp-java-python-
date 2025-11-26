import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        System.out.println("=== 1) INSERTION ORDER LINKEDHASHMAP ===");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Apple", 100);
        map.put("Banana", 200);
        map.put("Cherry", 300);
        map.put("Dates", 400);

        System.out.println("Insertion Order:");
        System.out.println(map);
        // {Apple=100, Banana=200, Cherry=300, Dates=400}


        System.out.println("\n=== 2) ACCESS ORDER LINKEDHASHMAP ===");

        LinkedHashMap<String, Integer> accessMap =
                new LinkedHashMap<>(16, 0.75f, true); // access-order enabled

        accessMap.put("A", 1);
        accessMap.put("B", 2);
        accessMap.put("C", 3);

        // Access "A" and "B"
        accessMap.get("A");
        accessMap.get("B");

        System.out.println("After accessing A and B:");
        System.out.println(accessMap);
        // LRU order: C (least recent), A, B (most recent)


        System.out.println("\n=== 3) removeEldestEntry() → LRU CACHE ===");

        LinkedHashMap<Integer, String> lruCache =
                new LinkedHashMap<>(3, 0.75f, true) {

                    @Override
                    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                        return size() > 3; // maintain max size = 3
                    }
                };

        lruCache.put(1, "A");
        lruCache.put(2, "B");
        lruCache.put(3, "C");
        lruCache.get(1); // 1 becomes most recent
        lruCache.put(4, "D"); // removes LRU (key=2)

        System.out.println("LRU Cache contents:");
        System.out.println(lruCache);
        // Expected: {3=C, 1=A, 4=D}


        System.out.println("\n=== 4) MAP METHODS ON LINKEDHASHMAP ===");

        LinkedHashMap<String, Integer> m = new LinkedHashMap<>();
        m.put("X", 10);
        m.put("Y", 20);
        m.put("Z", 30);

        System.out.println("m: " + m);

        System.out.println("\nget(): " + m.get("Y")); // 20
        System.out.println("getOrDefault(): " + m.getOrDefault("Unknown", -1));

        m.putIfAbsent("Y", 99); // ignored
        m.putIfAbsent("P", 40); // added
        System.out.println("\nAfter putIfAbsent: " + m);

        m.replace("X", 111);
        System.out.println("After replace: " + m);

        m.compute("Y", (k,v) -> v + 5);
        System.out.println("After compute: " + m);

        m.merge("Z", 10, Integer::sum);
        System.out.println("After merge: " + m);

        System.out.println("\nKeySet: " + m.keySet());
        System.out.println("Values: " + m.values());

        System.out.println("\nEntrySet:");
        for (Map.Entry<String,Integer> e: m.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("\nClear map:");
        m.clear();
        System.out.println("After clear: " + m);
    }
}
