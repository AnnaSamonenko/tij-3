package task25;

//: c11:Statistics.java
// Simple demonstration of HashMap.

import java.util.*;

public class Statistics {

    private Random rand = new Random();

    public Map statistics(Map m) {
        for (int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
            Integer r = new Integer(rand.nextInt(20));
            if (m.containsKey(r))
                ((Counter) m.get(r)).i++;
            else
                m.put(r, new Counter());
        }
        return m;
    }

    class Counter {
        int i = 1;

        public String toString() {
            return Integer.toString(i);
        }
    }
}
