package as.collections.ex26;

import as.collections.ex5.utils.Collections2;

import java.util.*;

/**
 * Produce a Map and a Set containing all the countries that begin with A.
 */
public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Set set = new HashSet();

        Collections2.fillWithFilter(map, Collections2.geography, 10);
        Collections2.fillWithFilter(set, Collections2.countries, 10);

        print(map);
        print(set);
    }

    public static void print(Collection c) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static void print(Map m) {
        for (Object o : m.keySet()) {
            System.out.print(o.toString() + ": " + m.get(o) + " ");
        }
        System.out.println();
    }
}
