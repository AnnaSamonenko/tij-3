package as.collections.ex27;

import as.collections.ex5.utils.Collections2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Using Collections2.countries, fill a Set multiple times with the same data and
 * verify that the Set ends up with only one of each instance. Try this with both kinds of Set.
 */

public class Main {

    public static void main(String[] args) {
        Set set = new HashSet();
        Collections2.fill(set, Collections2.countries, 4);
        Collections2.fill(set, Collections2.countries.reset(), 4);
        print(set);
    }

    public static void print(Collection c) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

}
