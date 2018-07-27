package as.collections.ex9;

import java.util.*;

/**
 * Fill a HashMap with key-value pairs.
 * Print the results to show ordering by hash code.
 * Extract the pairs, sort by key, and place the result into a LinkedHashMap.
 * Show that the insertion order is maintained.
 */

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        fill(map);
        output(map);
        Map<Integer, String> map2 = new LinkedHashMap<>(new TreeMap<>(map));
        output(map2);
    }

    static void fill(Map map) {
        map.put(2, "Anna");
        map.put(45, "Maria");
        map.put(5, "Sofia");
    }

    static void output(Map<Integer, String> map) {
        for (String value : map.values()) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
