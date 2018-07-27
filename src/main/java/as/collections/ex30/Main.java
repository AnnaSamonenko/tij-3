package as.collections.ex30;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Fill a LinkedHashMap with String keys and objects of your choice. Now extract the pairs,
 * sort them based on the keys, and re-insert them into the Map.
 */

public class Main {

    public static void main(String[] args) {
        Map<String, Name> map = new LinkedHashMap<>();
        map.put("1", new Name("Anna"));
        map.put("3", new Name("Lera"));
        map.put("2", new Name("Lia"));

        System.out.println(map);

        SortedMap sortedMap = new TreeMap(map);
        map = sortedMap;
        System.out.println(map);
    }

}
