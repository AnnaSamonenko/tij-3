package as.interfaces_and_inner_classes.ex23;

/**
 * Create a class with an inner class. In a separate class, make an instance of the inner class.
 */

public class Ex23 {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
    }

}
