import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        System.out.println("1) put(K,V)");
        map.put("Apple", 100);
        map.put("Banana", 200);
        map.put("Cherry", 300);
        System.out.println(map);
        // {Apple=100, Banana=200, Cherry=300}

        System.out.println("\n2) get(K)");
        System.out.println("Value of Banana: " + map.get("Banana"));
        // 200

        System.out.println("\n3) getOrDefault(K, default)");
        System.out.println("Value of Mango: " + map.getOrDefault("Mango", -1));
        // -1

        System.out.println("\n4) containsKey(K)");
        System.out.println("Contains 'Apple'? " + map.containsKey("Apple"));
        // true

        System.out.println("\n5) containsValue(V)");
        System.out.println("Contains value 300? " + map.containsValue(300));
        // true

        System.out.println("\n6) putIfAbsent(K,V)");
        map.putIfAbsent("Banana", 999);
        map.putIfAbsent("Dates", 400);
        System.out.println(map);
        // Dates added, Banana ignored

        System.out.println("\n7) replace(K,V)");
        map.replace("Apple", 111);
        System.out.println(map);
        // Apple=111

        System.out.println("\n8) replace(K, oldV, newV)");
        map.replace("Banana", 200, 222);
        System.out.println(map);
        // Banana=222 (only replaced if old = 200)

        System.out.println("\n9) remove(K)");
        map.remove("Cherry");
        System.out.println(map);

        System.out.println("\n10) remove(K,V)");
        map.remove("Apple", 111); // removed only if matches value
        System.out.println(map);

        System.out.println("\n11) keySet()");
        System.out.println("Keys: " + map.keySet());

        System.out.println("\n12) values()");
        System.out.println("Values: " + map.values());

        System.out.println("\n13) entrySet()");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("\n14) compute(K, remappingFunction)");
        map.compute("Banana", (k, v) -> v + 50);
        System.out.println(map);
        // Banana = 272

        System.out.println("\n15) computeIfAbsent(K, mappingFunction)");
        map.computeIfAbsent("Elderberry", k -> 500);
        System.out.println(map);

        System.out.println("\n16) computeIfPresent(K, remappingFunction)");
        map.computeIfPresent("Dates", (k, v) -> v + 10);
        System.out.println(map);

        System.out.println("\n17) merge(K, V, remappingFunction)");
        map.merge("Banana", 100, (oldV, newV) -> oldV + newV);
        // Banana = 272 + 100 = 372
        System.out.println(map);

        System.out.println("\n18) size()");
        System.out.println("Size: " + map.size());

        System.out.println("\n19) isEmpty()");
        System.out.println("Is empty? " + map.isEmpty());

        System.out.println("\n20) clear()");
        map.clear();
        System.out.println("After clear(): " + map);
    }
}
