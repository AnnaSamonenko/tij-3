package as.interfaces_and_inner_classes.ex13;

/**
 * Repeat Exercise 12 but define the inner class within a scope within a method.
 */

public class Ex13 {

    public static void main(String[] args) {
        Ex13 ex13 = new Ex13();
        ex13.methodWithInnerClass().method();
    }

    public IFirst methodWithInnerClass() {
        {
            class LocalClass implements IFirst {
                @Override
                public void method() {
                    System.out.println("baida");
                }
            }
            return (IFirst) new LocalClass();
        }
    }
}
