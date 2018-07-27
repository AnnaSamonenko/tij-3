package as.collections.ex4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Take the Gerbil class in Exercise 2 and put it into a Map instead, associating the name of the Gerbil as a String
 * (the key) for each Gerbil (the value) you put in the table. Get an Iterator for the keySet( )
 * and use it to move through the Map, looking up the Gerbil for each key and printing out the key
 * and telling the gerbil to hop( ).
 */

public class Main {
    public static void main(String[] args) {
        Map<String, Gerbil> gerbils = generateGerbilsName();

        Set gerbilsName = gerbils.keySet();
        Iterator<String> gerbilNameIterator = gerbilsName.iterator();

        while (gerbilNameIterator.hasNext()) {
            String key = gerbilNameIterator.next();
            System.out.print(key + ": ");
            gerbils.get(key).hop();
        }
    }

    private static Map<String, Gerbil> generateGerbilsName() {
        Map<String, Gerbil> gerbils = new HashMap<>();
        gerbils.put("Dart", new Gerbil(1));
        gerbils.put("Monika", new Gerbil(3));
        gerbils.put("Mark", new Gerbil(2));
        return gerbils;
    }
}
