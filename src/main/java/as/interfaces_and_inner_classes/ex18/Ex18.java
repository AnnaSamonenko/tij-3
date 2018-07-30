package as.interfaces_and_inner_classes.ex18;

/**
 * Create a class with a private field and a private method.
 * Create an inner class with a method that modifies the outer class field and calls the outer class method.
 * In a second outer class method, create an object of the inner class and call its method,
 * then show the effect on the outer class object.
 */
public class Ex18 {

    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.callModifier();
    }

}
