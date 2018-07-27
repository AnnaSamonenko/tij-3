package task20;

import java.util.*;

/**
 * Write a method that uses an Iterator to step through a Collection
 * and print the hashCode() of each object in the container.
 * Fill all the different types of Collections with objects and apply your method to each container.
 */
public class Main {

    public static void main(String[] args) {
        List list = new ArrayList();
        generateCollection(list);
        printHashCode(list);

        Set set = new HashSet(list);
        printHashCode(set);
    }

    public static void printHashCode(Collection c) {
        Iterator itr = c.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next().hashCode() + " ");
        }
        System.out.println();
    }

    public static void generateCollection(Collection c) {
        c.add("1");
        c.add("2");
        c.add("3");
    }

}
