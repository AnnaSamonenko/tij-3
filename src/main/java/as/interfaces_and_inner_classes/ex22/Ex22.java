package as.interfaces_and_inner_classes.ex22;

/**
 * Create a class containing an inner class that itself contains an inner class.
 * Repeat this using nested classes.
 * Note the names of the .class files produced by the compiler.
 */

public class Ex22 {

    public static void main(String[] args) {
        // example of creation of Inner Classes
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass1 innerClass1 = outerClass.new InnerClass1();
        OuterClass.InnerClass1.InnerClass2 innerClass2 = innerClass1.new InnerClass2();

        //example of creation Nested Classes
        OuterClass2.NestedClass1 nestedClass1 = new OuterClass2.NestedClass1();
        OuterClass2.NestedClass1.NestedClass2 nestedClass2 = new OuterClass2.NestedClass1.NestedClass2();
    }

}
