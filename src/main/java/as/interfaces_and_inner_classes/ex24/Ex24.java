package as.interfaces_and_inner_classes.ex24;

/**
 * Create a class with an inner class that has a nondefault constructor (one that takes arguments).
 * Create a second class with an inner class that inherits from the first inner class.
 */

public class Ex24 {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass2 outerClass2 = new OuterClass2();

        OuterClass2.InnerClass innerClass = outerClass2.new InnerClass(outerClass, 3);
        outerClass.printI();

    }

}
