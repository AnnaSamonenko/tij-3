package as.collections.ex19;

import as.collections.ex5.utils.Collections2;

import java.util.*;

/**
 * Create both an ArrayList and a LinkedList, and fill each using the Collections2.capitals generator.
 * Print each list using an ordinary Iterator, then insert one list into the other by using a ListIterator,
 * inserting at every other location. Now perform the insertion starting at the end of
 * the first list and moving backward.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList arrList = new ArrayList();
        LinkedList lnList = new LinkedList();

        Collections2.fill(arrList, Collections2.capitals, 10);
        Collections2.fill(lnList, Collections2.capitals, 10);

        printCollection(arrList);
        printCollection(lnList);

        insertList(arrList, lnList);
        printCollection(arrList);

        insertListBackword(arrList, lnList);
        printCollection(arrList);
    }

    public static void printCollection(Collection c) {
        Iterator itr = c.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
    }

    public static void insertList(List list1, List list2) {
        ListIterator it1 = list1.listIterator(list1.size());
        ListIterator it2 = list2.listIterator();
        while (it2.hasNext()) {
            it1.add(it2.next());
        }
    }

    public static void insertListBackword(List list1, List list2) {
        ListIterator it1 = list1.listIterator(list1.size());
        ListIterator it2 = list2.listIterator(list2.size());
        while (it2.hasPrevious()) {
            it1.add(it2.previous());
        }
    }
}
