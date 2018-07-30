package as.detecting_types.ex13;

import java.lang.reflect.Constructor;

/**
 * In ToyTest.java, use reflection to create a Toy object using the nondefault constructor.
 */

interface HasBatteries {
}

interface Waterproof {
}

interface ShootsThings {
}

class Toy {
    // Comment out the following default
    // constructor to see
    // NoSuchMethodError from (*1*)
    int i;

    Toy() {
    }

    Toy(int i) {
        this.i = i;
    }

    public String toString() {
        return "" + i;
    }
}

class FancyToy extends Toy implements HasBatteries,
        Waterproof, ShootsThings {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    public static void main(String[] args) throws Exception {
        Class c = null;
        try {
            c = Class.forName("as.detecting_types.ex13.Toy");
            // Way with no default constructor
            Constructor<Toy> constructor = c.getDeclaredConstructor(int.class);
            Toy toy = constructor.newInstance(5);
            System.out.println(toy);
        } catch (ClassNotFoundException e) {
            System.err.println("Can't find FancyToy");
            throw e;
        }

    }

}

