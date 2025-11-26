import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        System.out.println("1) put(K,V) — allows null key & null value");
        map.put("Apple", 100);
        map.put("Banana", 200);
        map.put(null, 500);         // null key
        map.put("Cherry", null);    // null value
        System.out.println(map);

        System.out.println("\n2) Duplicate keys overwrite value");
        map.put("Apple", 999);
        System.out.println(map);

        System.out.println("\n3) get(K) & getOrDefault()");
        System.out.println("get(Banana): " + map.get("Banana"));
        System.out.println("get(Unknown): " + map.getOrDefault("Unknown", -1));

        System.out.println("\n4) containsKey(), containsValue()");
        System.out.println("containsKey(null): " + map.containsKey(null));
        System.out.println("containsValue(200): " + map.containsValue(200));

        System.out.println("\n5) putIfAbsent()");
        map.putIfAbsent("Banana", 777); // won't change
        map.putIfAbsent("Dates", 400);  // added
        System.out.println(map);

        System.out.println("\n6) remove(K) & remove(K,V)");
        map.remove(null);
        map.remove("Apple", 999);
        System.out.println(map);

        System.out.println("\n7) keySet()");
        System.out.println("Keys: " + map.keySet());

        System.out.println("\n8) values()");
        System.out.println("Values: " + map.values());

        System.out.println("\n9) entrySet()");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("\n10) compute(K, remappingFunction)");
        map.compute("Banana", (k,v) -> v + 10);
        System.out.println(map);

        System.out.println("\n11) computeIfAbsent()");
        map.computeIfAbsent("Elderberry", k -> 600);
        System.out.println(map);

        System.out.println("\n12) computeIfPresent()");
        map.computeIfPresent("Dates", (k,v) -> v * 2);
        System.out.println(map);

        System.out.println("\n13) merge(K,V, remappingFunction)");
        map.merge("Banana", 50, (oldV,newV) -> oldV + newV);
        System.out.println(map);

        System.out.println("\n14) size() & isEmpty()");
        System.out.println("Size: " + map.size());
        System.out.println("isEmpty: " + map.isEmpty());

        System.out.println("\n15) clear()");
        map.clear();
        System.out.println("After clear(): " + map);
    }
}
