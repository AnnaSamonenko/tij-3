package as.detecting_types.task4;

//TODO 1

/**
 * Modify SweetShop.java so that each type of object creation is controlled by a command-line argument.
 * That is, if your command line is “java SweetShop Candy,” then only the Candy object is created.
 * Notice how you can control which Class objects are loaded via the command-line argument.
 */

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}
