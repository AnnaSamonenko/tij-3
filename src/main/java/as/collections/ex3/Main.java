package as.collections.ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Modify Exercise 2 so you use an Iterator to move through the List while calling hop() .
 */

public class Main {
    public static void main(String[] args) {
        List<Gerbil> gerbils = new ArrayList<>();

        for (int i = 1; i < 10; i++)
            gerbils.add(new Gerbil(i));

        Iterator<Gerbil> iterator = gerbils.iterator();
        while (iterator.hasNext()) {
            iterator.next().hop();
        }
    }
}
