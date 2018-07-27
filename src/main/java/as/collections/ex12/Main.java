package task12;

import task12.utils.MyStringArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a container that encapsulates an array of String, and that only adds StringsComparator and gets StringsComparator,
 * so that there are no casting issues during use.
 * If the internal array isnt big enough for the next add, your container should automatically resize it.
 * In main( ), compare the performance of your container with an ArrayList holding StringsComparator.
 */
public class Main {

    public static void main(String[] args) {
        //------------1
        long startTime = System.nanoTime();
        testStringArrayList();
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        //------------2
        startTime = System.nanoTime();
        testMyStringArray();
        endTime = System.nanoTime();
        System.out.print(endTime - startTime);
    }

    static void testMyStringArray() {
        MyStringArray stringArray = new MyStringArray();
        stringArray.add("Anna");
        stringArray.add("Masha");
        stringArray.add("Olga");

        for (int i = 0; i < stringArray.size(); i++) {
            stringArray.get(i);
        }
    }

    static void testStringArrayList() {
        List stringArray = new ArrayList<>();
        stringArray.add("Anna");
        stringArray.add("Masha");
        stringArray.add("Olga");

        for (int i = 0; i < stringArray.size(); i++) {
            stringArray.get(i);
        }
    }

}
