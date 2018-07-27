package task13;

import task13.utils.MyIntegerArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Repeat Exercise 12 for a container of int, and compare the performance to an ArrayList holding Integer objects.
 * In your performance comparison, include the process of incrementing each object in the container.
 */
public class Main {

    public static void main(String[] args) {
        //------------1
        long startTime = System.nanoTime();
        testIntegerArrayList();
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        //------------2
        startTime = System.nanoTime();
        testMyIntegerArray();
        endTime = System.nanoTime();
        System.out.print(endTime - startTime);
    }

    static void testMyIntegerArray() {
        MyIntegerArray integerArray = new MyIntegerArray();
        integerArray.add(1);
        integerArray.add(2);
        integerArray.add(2);

        for (int i = 0; i < integerArray.size(); i++) {
            integerArray.get(i);
        }
    }

    static void testIntegerArrayList() {
        List integerArray = new ArrayList<>();
        integerArray.add(1);
        integerArray.add(2);
        integerArray.add(2);
        for (int i = 0; i < integerArray.size(); i++) {
            integerArray.get(i);
        }
    }

}
