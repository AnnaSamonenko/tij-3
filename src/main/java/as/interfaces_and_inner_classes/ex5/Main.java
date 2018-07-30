package as.interfaces_and_inner_classes.ex5;

/**
 * Modify Exercise 5 by creating an abstract class and inheriting that into the derived class.
 */

public class Main {

    public static void main(String[] args) {
        NewClass newClass = new NewClass();
        takeInterface1(newClass);
        takeInterface2(newClass);
        takeInterface3(newClass);
        takeNewInterface(newClass);

    }

    static void takeInterface1(Interface1 interface1) {
        interface1.method11();
        interface1.method12();
        interface1.method13();
    }

    static void takeInterface2(Interface2 interface2) {
        interface2.method21();
        interface2.method22();
        interface2.method23();
    }

    static void takeInterface3(Interface3 interface3) {
        interface3.method31();
        interface3.method32();
        interface3.method33();
    }

    static void takeNewInterface(NewInterface newInterface) {
        newInterface.newMethod();
    }

}
