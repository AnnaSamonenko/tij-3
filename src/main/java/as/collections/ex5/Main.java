package as.collections.ex5;

import as.collections.ex5.utils.Collections2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Create a List (try both ArrayList and LinkedList) and fill it using Collections2.countries.
 * Sort the list and print it, then apply Collections.shuffle( ) to the list repeatedly,
 * printing it each time so that you can see how the shuffle( ) method randomizes the list differently each time.
 */
public class Main {

    public static void main(String[] args) {
        List countriesLinkedList = new LinkedList();
        Collections2.fill(countriesLinkedList, Collections2.countries, 10);
        Collections.sort(countriesLinkedList);
        Collections.shuffle(countriesLinkedList);
        Collections.shuffle(countriesLinkedList);
    }
}
