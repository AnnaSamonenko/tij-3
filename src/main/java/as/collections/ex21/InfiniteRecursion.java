package as.collections.ex21;

import java.util.*;

/**
 * Repair the problem in InfiniteRecursion.java.
 */
public class InfiniteRecursion {

    @Override
    public String toString() {
        return " InfiniteRecursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List v = new ArrayList();
        for (int i = 0; i < 10; i++)
            v.add(new InfiniteRecursion());

        System.out.println(v);
    }
}

