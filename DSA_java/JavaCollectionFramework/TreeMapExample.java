import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        System.out.println("1) put(K,V) — sorted by key:");
        map.put(50, "Apple");
        map.put(10, "Banana");
        map.put(30, "Cherry");
        map.put(70, "Dates");
        map.put(60, "Elderberry");
        System.out.println(map);
        // {10=Banana, 30=Cherry, 50=Apple, 60=Elderberry, 70=Dates}

        System.out.println("\n2) get(), getOrDefault()");
        System.out.println("get(30): " + map.get(30));
        System.out.println("getOrDefault(999, NONE): " + map.getOrDefault(999, "NONE"));

        System.out.println("\n3) containsKey(), containsValue()");
        System.out.println(map.containsKey(50));
        System.out.println(map.containsValue("Cherry"));

        System.out.println("\n4) remove()");
        map.remove(70);
        System.out.println(map);

        System.out.println("\n5) comparator()");
        System.out.println("Comparator: " + map.comparator());
        // null means natural ordering (ascending)

        System.out.println("\n6) firstKey(), lastKey()");
        System.out.println("firstKey: " + map.firstKey());
        System.out.println("lastKey: " + map.lastKey());

        System.out.println("\n7) headMap(toKey)");
        System.out.println("headMap(50): " + map.headMap(50));
        // < 50 → {10, 30}

        System.out.println("\n8) tailMap(fromKey)");
        System.out.println("tailMap(50): " + map.tailMap(50));
        // >= 50 → {50, 60}

        System.out.println("\n9) subMap(fromKey, toKey)");
        System.out.println("subMap(30, 60): " + map.subMap(30, 60));
        // [30, 50)

        /* ------------ NavigableMap Methods ------------ */

        System.out.println("\n10) lowerKey(<)");
        System.out.println("lowerKey(50): " + map.lowerKey(50));

        System.out.println("\n11) floorKey(<=)");
        System.out.println("floorKey(55): " + map.floorKey(55));

        System.out.println("\n12) ceilingKey(>=)");
        System.out.println("ceilingKey(55): " + map.ceilingKey(55));

        System.out.println("\n13) higherKey(>)");
        System.out.println("higherKey(50): " + map.higherKey(50));

        System.out.println("\n14) pollFirstEntry()");
        System.out.println("pollFirstEntry: " + map.pollFirstEntry());
        System.out.println(map);

        System.out.println("\n15) pollLastEntry()");
        System.out.println("pollLastEntry: " + map.pollLastEntry());
        System.out.println(map);

        /* add back entries for next methods */
        map.put(10, "Banana");
        map.put(70, "Dates");

        System.out.println("\n16) descendingMap()");
        System.out.println(map.descendingMap());
        // Reverse order

        System.out.println("\n17) descendingKeySet()");
        System.out.println(map.descendingKeySet());

        System.out.println("\n18) headMap(toKey, inclusive)");
        System.out.println(map.headMap(50, true));

        System.out.println("\n19) tailMap(fromKey, inclusive)");
        System.out.println(map.tailMap(50, false));

        System.out.println("\n20) subMap(from,true,to,false)");
        System.out.println(map.subMap(10, true, 60, false));

        System.out.println("\n21) keySet(), values(), entrySet()");
        System.out.println("keySet: " + map.keySet());
        System.out.println("values: " + map.values());
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }

        System.out.println("\n22) clear()");
        map.clear();
        System.out.println("After clear: " + map);
    }
}
