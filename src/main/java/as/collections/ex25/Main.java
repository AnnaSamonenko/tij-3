package as.collections.ex25;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Use a TreeMap in Statistics.java.
 * Now add code that tests the performance difference between HashMap and TreeMap in that program.
 */
public class Main {

    public static void main(String args[]) {

        Statistics statistics = new Statistics();
        Map treeMap = new TreeMap();
        Map hashMap = new HashMap();

        System.out.println("TreeMap: " + testPerformance(statistics.statistics(treeMap)));
        System.out.println("HashMap: " + testPerformance(statistics.statistics(hashMap)));

    }

    public static int testPerformance(Map m) {
        int sum = 0;
        for (Object o : m.keySet()) {
            int diff = Math.abs(500 - Integer.parseInt(m.get(o).toString()));
            sum += diff;
        }
        return sum;
    }

}
