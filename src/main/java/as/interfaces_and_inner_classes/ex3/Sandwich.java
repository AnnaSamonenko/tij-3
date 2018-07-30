package as.interfaces_and_inner_classes.ex3;

/**
 * In c07:Sandwich.java, create an interface called FastFood (with appropriate methods)
 * and change Sandwich so that it also implements FastFood.
 */

interface FastFood {
    void cook();
}

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

public class Sandwich extends PortableLunch implements FastFood {

    @Override
    public void cook() {
        Bread b = new Bread();
        Cheese c = new Cheese();
        Lettuce l = new Lettuce();
    }

    Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        Sandwich s = new Sandwich();
        s.cook();

    }
}
