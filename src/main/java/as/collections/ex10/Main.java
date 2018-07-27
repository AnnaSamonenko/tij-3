package as.collections.ex10;

import java.util.*;

/**
 * Repeat the previous example with a HashSet and LinkedHashSet.
 */

public class Main {

    public static void main(String[] args) {
        Set<String> set = new HashSet();
        fill(set);
        output(set);
        Set set2 = new LinkedHashSet(new TreeSet(set));
        output(set2);
    }

    static void fill(Set set) {
        set.add("Emmy");
        set.add("Ginger");
        set.add("Emmy2");
    }

    static void output(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
    }
}
