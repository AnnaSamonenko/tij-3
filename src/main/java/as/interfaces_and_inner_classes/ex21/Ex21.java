package as.interfaces_and_inner_classes.ex21;

/**
 * Create an interface containing a nested class. Implement this interface and create an instance of the nested class.
 */

public class Ex21 {

    public static void main(String[] args) {
        ClassImpl.NestedClass nestedClass = new ClassImpl.NestedClass();
        nestedClass.printI();
    }
}