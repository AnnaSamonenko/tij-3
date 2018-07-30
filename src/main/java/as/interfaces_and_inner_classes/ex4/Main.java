package as.interfaces_and_inner_classes.ex4;

/**
 * Create three interfaces, each with two methods. Inherit a new interface from the three, adding a new method.
 * Create a class by implementing the new interface and also inheriting from a concrete class.
 * Now write four methods, each of which takes one of the four interfaces as an argument.
 * In main(), create an object of your class and pass it to each of the methods.
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
