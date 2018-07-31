package as.interfaces_and_inner_classes.ex29;

/**
 * Show that an inner class has access to the private elements of its outer class.
 * Determine whether the reverse is true.
 */

public class Ex29 {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.printInnerClassField();
    }
}
