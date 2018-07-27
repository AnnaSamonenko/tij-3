package as.collections.ex18;

import as.collections.ex1.util.Arrays2;
import as.collections.ex5.utils.Collections2;

import java.util.Set;
import java.util.TreeSet;

//TODO
/**
 * Use Arrays2.RandStringGenerator to fill a TreeSet, but by using alphabetic ordering.
 * Print the TreeSet to verify the sort order.
 */
public class Main {

    public static void main(String[] args) {
        Set treeSet = new TreeSet();
        Collections2.fill(treeSet, new Arrays2.RandStringGenerator(10), 10);
        System.out.println(treeSet);
    }

}
