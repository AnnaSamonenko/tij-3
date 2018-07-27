package task33;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Create a FastTraversalLinkedList that internally uses a LinkedList for rapid insertions and removals,
 * and an ArrayList for rapid traversals and get( ) operations. Test it by modifying ArrayPerformance.java.
 */

public class Main {

    public static void main(String[] args) {
        List fastTraversalLinkedList = new FastTraversalLinkedList();
        List linkedList = new LinkedList();
        List arrayList = new ArrayList();

        printStatisticsAdding(fastTraversalLinkedList, linkedList, arrayList);
        printStatisticsGetting(fastTraversalLinkedList, linkedList, arrayList);
        printStatisticsRemoving(fastTraversalLinkedList, linkedList, arrayList);
    }

    static void printStatisticsAdding(List list1, List list2, List list3) {
        System.out.println("Adding:");
        System.out.println("MonsterList: " + countPerformanceOfAdding(list1));
        System.out.println("LinkedList: " + countPerformanceOfAdding(list2));
        System.out.println("ArrayList: " + countPerformanceOfAdding(list3));
        System.out.println();
    }

    static void printStatisticsRemoving(List list1, List list2, List list3) {
        System.out.println("Removing:");
        System.out.println("MonsterList: " + countPerformanceOfRemoving(list1));
        System.out.println("LinkedList: " + countPerformanceOfRemoving(list2));
        System.out.println("ArrayList: " + countPerformanceOfRemoving(list3));
        System.out.println();
    }

    static void printStatisticsGetting(List list1, List list2, List list3) {
        System.out.println("Getting:");
        System.out.println("MonsterList: " + countPerformanceOfGet(list1));
        System.out.println("LinkedList: " + countPerformanceOfGet(list2));
        System.out.println("ArrayList: " + countPerformanceOfGet(list3));
        System.out.println();
    }

    static long countPerformanceOfGet(List list) {
        Long startTime = System.nanoTime();
        get(list);
        return System.nanoTime() - startTime;
    }

    static long countPerformanceOfRemoving(List list) {
        Long startTime = System.nanoTime();
        remove(list);
        return System.nanoTime() - startTime;
    }

    static long countPerformanceOfAdding(List list) {
        Long startTime = System.nanoTime();
        add(list);
        return System.nanoTime() - startTime;
    }

    static void add(List list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }

    static void remove(List list) {
        for (int i = list.size() - 1; i > 0; i -= 2) {
            list.remove(i);
        }
    }

    static void get(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }

}
